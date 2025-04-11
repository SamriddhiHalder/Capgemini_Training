package hashmap;

public class HmImplementation {
	Entry[]buckets=new Entry[12];
	int bucketSize=buckets.length;
	
	public int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%bucketSize;
	}
	 public void put(int key,int value) {
		 Entry node=new Entry(key,value);
		 int index=getBucketIndex(key);
		 System.out.println("this entry is added at index:" + index);
		 if(buckets[index]==null) {
			 buckets[index]=node;
		 } else {
			 Entry head=buckets[index];
			 while(head!=null) {
				 if(buckets[index].key==key) {
					 buckets[index].value=value;
				 } else {
					 head=head.next;
				 }
			 }
			 node.next=buckets[index];
			 buckets[index]=node;
		 }
		 
		 
	 }
	 public void getValue(int key) {
		 int index=getBucketIndex(key);
		 if(buckets[index]==null) {
			 throw new RuntimeException("the bucket at index"+ index+" is empty");
		 }
		 else {
			 Entry head=buckets[index];
			 while(head!=null) {
				 if(buckets[index].key==key) {
					 return;
				 } else {
					 head=head.next;
				 }
				 throw  new RuntimeException("the key doesn't exist");
			 }
		 }
	 }
	 public void DeleteBykey(int key) {
		 int index=getBucketIndex(key);
		 Entry prev=buckets[index];
		 Entry check= prev.next;
		 if(prev.key==key) {
			 buckets[index]=prev.next;
			 
		} else {
			while(check!=null) {
				if(check.key==key) {
					prev.next=check.next;
				}
				check=check.next;
			}
		}
		 

}
public void display() {
	for(Entry e: buckets) {
		if(e==null) {
			continue;
		} else if(e.next==null) {
			System.out.println(e.value);
		}else {
				Entry current=e;
				while(current!= null) {
					System.out.println(current.value+"-->");
					current=current.next;
					
				}
				System.out.println();
			}
			
		}
	}
public static void main(String[] args) {
	HmImplementation mp= new HmImplementation();
	mp.put(12,1);
	mp.put(24,2);
	mp.put(36,3);
	mp.display();
	mp.DeleteBykey(12);
	mp.display();
	
}
}
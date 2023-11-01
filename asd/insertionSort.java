public void insertionSort(Comparable<T>[] list)
{

for(int index = 1 ; index < list.length;index++){

Comparable<T> key = list[index];

int position = index;

while(position > 0 && key.compareTo((T)list[position-1]) < 0)
{
list[position] = list[position-1];
position--;
}

list[position] = key;

}

}

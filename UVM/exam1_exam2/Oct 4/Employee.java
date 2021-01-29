   public Employee(String name, int id, Department dept)
   {
      this.name = name;
      this.id = id;
      this.dept = dept;
   }
   
   @Override
   public String toString()
   {
      return name + " " + id + "dept" + dept;
   }
}
//copy constructer

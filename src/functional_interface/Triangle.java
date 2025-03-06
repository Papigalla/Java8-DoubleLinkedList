package functional_interface;
	import java.util.Scanner;

	public class Triangle {
		
		public void square()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)             
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		public void rightAngle()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
			
		public void leftAngle()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		public void scalene()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
			
		public void scalenedown()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			} 
		}
		
		public void equilateral()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("  ");
					
				}
				for(int j=1;j<i;j++)
				{
					System.out.print(" *");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			} 
		}
			
		public void reverse()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			} 
		}
			
		public void tetrahedron()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
			
		public void diamond()
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			} 
		}
		
		public void biTriangle()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		public void biTetrahedron()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		public void tetrahedronAttached()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		public void xTriangle()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<n;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("* ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
				
			}
		}
			
		
		public void hallowSquare()
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==n||i==1||j==1||j==n)
					{
					System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
			
		public void hallowRightAngled()
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(j==1||i==j||i==n)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		
		public void hallowLeftAngled()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the number of patterns :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					if(i==1||j==i||j==n)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

	}


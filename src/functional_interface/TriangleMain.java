package functional_interface;
import java.util.Scanner;
public class TriangleMain {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			Triangle t= new Triangle();
			while(true)
			{
				System.out.println("Press 1 To display square");
				System.out.println("Press 2 To display Rightangled Triangle");
				System.out.println("Press 3 To display leftAngle Triangle");
				System.out.println("Press 4 To display scalene Triangle");
				System.out.println("Press 5 To display scaleneDown Triangle");
				System.out.println("Press 6 To display Equilateral Triangle");
				System.out.println("Press 7 To display reverse Triangle");
				System.out.println("Press 8 To display Tetrahedron Triangle");
				System.out.println("Press 9 To display Diamond Triangle");
				System.out.println("Press 10 To display BiTriangle");
				System.out.println("Press 11 To display BiTetrahedron Triangle");
				System.out.println("Press 12 To display Tetrahedron attached Triangle");
				System.out.println("Press 13 To display X Triangle");
				System.out.println("Press 14 To display Hallow square");
				System.out.println("Press 15 To display Rightangled Triangle");
				System.out.println("Press 16 To display leftAngle Triangle");
				System.out.println("Press any key to exit");
				System.out.println("---------------------------------");
				System.out.println("Enter the number: ");
				int a=sc.nextInt();
				switch(a)
				{
				case 1:t.square();
				       break;
				case 2:t.rightAngle();
				       break;
				case 3:t.leftAngle();
				       break;
				case 4:t.scalene();
				       break;
				case 5:t.scalenedown();
				       break;
				case 6:t.equilateral();
				       break;
				case 7:t.reverse();
				       break;
				case 8:t.tetrahedron();
				       break;
				case 9:t.diamond();
				       break;
				case 10:t.biTriangle();
				        break;
				case 11:t.biTetrahedron();
				        break;
				case 12:t.tetrahedronAttached();
				        break;
				case 13:t.xTriangle();
				        break;
				case 14:t.hallowSquare();
				        break;
				case 15:t.hallowRightAngled();
				        break;
				case 16:t.hallowRightAngled();
				        break;
				default:
					System.exit(0);
				
				}
				
			}
		}
		

	}

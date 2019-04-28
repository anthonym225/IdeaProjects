#include <iostream>

int main() {
  double eWeight;
  int planet;

  std::cout << "What is your weight on Earth?: ";
  std::cin >> eWeight;

  std::cout << "Select a planet: \n";
  std::cout << " 1 : Venus \n 2 : Mars \n 3 : Jupiter \n 4 : Saturn \n 5 : Uranus \n";
  std::cin >> planet;

  switch(planet){
      case 1 :
      std::cout << "Your Weight : " << (eWeight * 0.78) << " lbs \n";
      break;
      case 2 :
      std::cout << "Your Weight : " << (eWeight * 0.39) << " lbs \n";
      break;
      case 3 :
      std::cout << "Your Weight : " << (eWeight * 2.65) << " lbs \n";
      break;
      case 4 :
      std::cout << "Your Weight : " << (eWeight * 1.17) << " lbs \n";
      break;
      case 5 :
      std::cout << "Your Weight : " << (eWeight * 1.05) << " lbs \n";
      break;
      default :
      std::cout << "Invalid \n";
      break;
  }
}

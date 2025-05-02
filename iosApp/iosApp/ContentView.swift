import SwiftUI
import shared

struct ContentView: View {
    @State private var searchText = ""//Greeting().greetVar()
	
    fileprivate func setText(fromKMM: String) -> some View {
        return Text(fromKMM)
            .font(.system(size: 14, weight: .regular))
            .padding() // Add padding around the text
            .background(Color.white) // Set the background color to blue
            .overlay(
                RoundedRectangle(cornerRadius: 10)
                    .stroke(.blue, lineWidth: 2)
            )
    }
    
    var body: some View {
        VStack {
            VStack(spacing: 0) {
                // Navigation bar container
                VStack(spacing: 8) {
                    // Search bar
                    HStack(spacing: 12) {
                        // Search icon
                        Image(systemName: "magnifyingglass")
                            .foregroundColor(Color(hex: "#666666"))
                            .frame(width: 20, height: 20)
                        
                        // Search field
                        TextField("Search for Electronics", text: $searchText)
                            .font(.system(size: 14, weight: .regular))
                            .foregroundColor(Color(hex: "#666666"))
                        
                        // Right icons
                        HStack(spacing: 8) {
                            Button(action: {}) {
                                Image(systemName: "camera")
                                    .foregroundColor(Color(hex: "#666666"))
                                    .frame(width: 24, height: 24)
                            }
                            
                            Button(action: {}) {
                                Image(systemName: "ellipsis")
                                    .foregroundColor(Color(hex: "#666666"))
                                    .frame(width: 24, height: 24)
                            }
                        }
                    }
                    .padding(.horizontal, 16)
                    .frame(height: 42)
                    .background(Color.white)
                    .cornerRadius(4)
                }
                .padding(.all, 8)
                .frame(height: 62)
                .background(Color.blue)
            }
            .frame(maxWidth: .infinity)
            .background(Color.blue)
            //variable
            setText(fromKMM: Greeting().greetVar())
            setText(fromKMM: Platform_iosKt.getPlatformVar.name)
            //fun
            setText(fromKMM: Greeting().greetFun())
            setText(fromKMM: Platform_iosKt.getPlatformFun().name)
            //class
            setText(fromKMM: Greeting().greetClass())
            setText(fromKMM: GetPlatformClass().name)
                
            Spacer()
        }
    }
}

// Add this color extension in a separate file (e.g., Color+Extensions.swift)
extension Color {
	init(hex: String) {
		let scanner = Scanner(string: hex.trimmingCharacters(in: CharacterSet.alphanumerics.inverted))
		var hexNumber: UInt64 = 0
		scanner.scanHexInt64(&hexNumber)
		
		let r = Double((hexNumber & 0xff0000) >> 16) / 255
		let g = Double((hexNumber & 0x00ff00) >> 8) / 255
		let b = Double(hexNumber & 0x0000ff) / 255
		self.init(red: r, green: g, blue: b)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

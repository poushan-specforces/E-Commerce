import logo from './logo.svg'
import './App.css'
import Navigation from './customer/components/navigation/navigation'
import HomePage from './customer/pages/HomePage/HomePage'
import Footer from './customer/components/Footer/Footer'
import Product from './customer/components/Product/Product'

function App() {
  return (
    <div className="App">
      <Navigation/>
      <div>
        <HomePage />
        <Product />
      </div>
      <Footer/>
    </div>
  )
}

export default App
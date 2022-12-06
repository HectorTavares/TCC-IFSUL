import {
    createBrowserRouter,
    createRoutesFromElements,
    Route,
  } from "react-router-dom";
import { Feed, Login } from "./pages";
import { Default } from "./pages/default";
console.log('entrou')

export const router = createBrowserRouter(
 
    createRoutesFromElements( //ver certinho como organizar as rotas e usar os loaders, componentes de erro e outlet
      <>
      <Route path="/" element={<Default />}/>
      <Route path="/feed" element={<Feed />} />
      <Route path="/login" element={<Login />} />
      </>
    )
  );
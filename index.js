
// ** Demo Components
import { Plus } from 'react-feather'
import InputPasswordToggle from '@components/input-password-toggle'
import { InputGroup, Input, InputGroupText, Button } from 'reactstrap'
import { Fragment } from 'react'
// ** Styles
import '@styles/react/libs/charts/apex-charts.scss'
import '@styles/base/pages/dashboard-ecommerce.scss'
import ttt from './ttt.png'

const EcommerceDashboard = () => {
  // ** Contex

  // ** vars
  return (
    
    <div id='dashboard-ecommerce'>
      <h1>
        LOCK FOOT
      </h1>
       <p>
      Vous aimez le football ? Vous souhaitez le pratiquer en toute convivialité, entre amis, collègues de travail, coéquipiers de club ou en famille, pour de purs moments de plaisir et de détente ?

Rejoignez-nous pour pour profiter pleinement de l’ensemble de nos offres.
      </p>
   <div className='image'> 
           <img src = {ttt}  width="1100" height ="500" style={{marginLeft:'100px', marginRight:'150px'}}/>  
          </div> 
          <h6 className='mb-2'style={{marginLeft:'500px'}}></h6>
    <h6 className='mb-2'style={{marginLeft:'500px'}}></h6>
    <h6 className='mb-2'style={{marginLeft:'500px'}}></h6> 
    <h6 className='mb-2'style={{marginLeft:'500px'}}></h6>
    <h6 className='mb-2'style={{marginLeft:'500px'}}></h6> 
       

      <h1>
        Contacter nous
      </h1>
      <Fragment>
      <InputGroup className='mb-2'>
          <InputGroupText>Nom & Prenom</InputGroupText>
        <Input />
      </InputGroup>
      <InputGroup className='mb-2'>
          <InputGroupText>Email</InputGroupText>
        <Input />
      </InputGroup>
      <InputGroup className='mb-2'>
          <InputGroupText>Telephone</InputGroupText>
        <Input />
      </InputGroup>
      <InputGroup className='mb-2'>
          <InputGroupText>N Carte</InputGroupText>
        <Input />
      </InputGroup>

      <InputGroup>
          <InputGroupText>Commentaire</InputGroupText>
        <Input type='textarea' />
      </InputGroup>
    </Fragment>
    <Button color='primary' size='sm' className='btn-add' onClick={() => setCount(count + 1)}>
              <span className='align-middle'>Save</span>
              </Button>
    </div>
    
  )
}

export default EcommerceDashboard

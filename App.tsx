import { View, Text, TouchableOpacity, StyleSheet } from "react-native";

export default function App() {

  function handleClick() {
    console.log('Clicando...')
  }

  return (
    <View style={styles.container}>
      <Text style={styles.text}>Avançando no Modulo</Text>

      <TouchableOpacity style={styles.areaButton} onPress={handleClick}>
        <Text style={styles.textButton}>Clicar</Text>
      </TouchableOpacity>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center'
  },
  text: {
    fontSize: 25
  },
  areaButton: {
    backgroundColor: '#2f53f2',
    paddingHorizontal: 40,
    paddingVertical: 10,
    marginTop: 15,
    borderRadius: 10,

  },
  textButton: {
    fontSize: 20,
    color: '#FFF',
    textTransform: "uppercase"
  }
})
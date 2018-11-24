
import io.reactivex.Observable
import org.apache.kafka.clients.consumer.*
import org.apache.kafka.common.record.Record
import org.apache.kafka.common.serialization.Deserializer
import org.apache.kafka.common.serialization.Serdes
import java.time.Duration
import java.util.*

class RxKafkaConsumer<T,A> {


    val pro  = RxKafkaProperties()

    fun  connector(){
        var pro  = RxKafkaProperties()



    }

    public  fun readTopic(topic :String): Observable<ConsumerRecords<T, A>?>? {
        return Observable.just(read(topic))

    }




    private  fun keySerde(): Serdes.StringSerde {
        return Serdes.StringSerde()

    }

    private fun valueSerde(): Serdes.StringSerde {

        return Serdes.StringSerde()
    }

    private fun read(topic: String): ConsumerRecords<T, A>? {
        val con = KafkaConsumer<T,A>(pro.kafkaProperties())

        val relbalancer: RxKafkaConsumerRebalancerListener = RxKafkaConsumerRebalancerListener()

        while (true){

            return con.poll(Duration.ofSeconds(1))
        }
    }


}
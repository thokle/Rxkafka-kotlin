import org.apache.kafka.clients.consumer.ConsumerRebalanceListener
import org.apache.kafka.common.TopicPartition

class RxKafkaConsumerRebalancerListener: ConsumerRebalanceListener {
    override fun onPartitionsRevoked(partitions: MutableCollection<TopicPartition>?) {

    }

    override fun onPartitionsAssigned(partitions: MutableCollection<TopicPartition>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
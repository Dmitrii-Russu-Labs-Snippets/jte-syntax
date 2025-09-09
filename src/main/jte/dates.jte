@import java.time.LocalDate
@import java.math.BigDecimal
@import java.text.NumberFormat
@import java.util.Locale
@import java.time.format.DateTimeFormatter
@param LocalDate currentDate
@param BigDecimal amount

<p>Date: ${currentDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))}</p>
<p>Number: ${NumberFormat.getNumberInstance(Locale.US).format(amount)}</p>
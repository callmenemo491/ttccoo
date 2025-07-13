package gi;

/* renamed from: gi.c */
/* loaded from: classes.dex */
public final class C2393c {

    /* renamed from: a */
    public static final gi.C2393c.a f10776a = null;

    /* renamed from: b */
    public static final java.lang.String[] f10777b = null;

    /* renamed from: c */
    public static final java.text.DateFormat[] f10778c = null;

    /* renamed from: gi.c$a */
    public static final class a extends java.lang.ThreadLocal<java.text.DateFormat> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public java.text.DateFormat initialValue() {
                r3 = this;
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r2 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
                r0.<init>(r2, r1)
                r1 = 0
                r0.setLenient(r1)
                java.util.TimeZone r1 = ci.C0988c.f5069e
                r0.setTimeZone(r1)
                return r0
        }
    }

    static {
            gi.c$a r0 = new gi.c$a
            r0.<init>()
            gi.C2393c.f10776a = r0
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.lang.String r2 = "EEEE, dd-MMM-yy HH:mm:ss zzz"
            java.lang.String r3 = "EEE MMM d HH:mm:ss yyyy"
            java.lang.String r4 = "EEE, dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r5 = "EEE, dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r6 = "EEE, dd MMM yy HH:mm:ss z"
            java.lang.String r7 = "EEE dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r8 = "EEE dd MMM yyyy HH:mm:ss z"
            java.lang.String r9 = "EEE dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r10 = "EEE dd-MMM-yy HH:mm:ss z"
            java.lang.String r11 = "EEE dd MMM yy HH:mm:ss z"
            java.lang.String r12 = "EEE,dd-MMM-yy HH:mm:ss z"
            java.lang.String r13 = "EEE,dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r14 = "EEE, dd-MM-yyyy HH:mm:ss z"
            java.lang.String r15 = "EEE MMM d yyyy HH:mm:ss z"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            gi.C2393c.f10777b = r0
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            gi.C2393c.f10778c = r0
            return
    }
}

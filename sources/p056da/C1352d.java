package p056da;

/* renamed from: da.d */
/* loaded from: classes.dex */
public class C1352d {

    /* renamed from: a */
    public static final java.util.concurrent.atomic.AtomicLong f6882a = null;

    /* renamed from: b */
    public static java.lang.String f6883b;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p056da.C1352d.f6882a = r0
            return
    }

    public C1352d(p056da.C1361h0 r11) {
            r10 = this;
            r10.<init>()
            r0 = 10
            byte[] r0 = new byte[r0]
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r1 / r3
            long r1 = r1 % r3
            r3 = 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r3)
            int r6 = (int) r5
            r4.putInt(r6)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            r5 = 0
            r4.position(r5)
            byte[] r4 = r4.array()
            r6 = r4[r5]
            r0[r5] = r6
            r6 = 1
            r7 = r4[r6]
            r0[r6] = r7
            r7 = 2
            r8 = r4[r7]
            r0[r7] = r8
            r8 = 3
            r4 = r4[r8]
            r0[r8] = r4
            byte[] r1 = m3854a(r1)
            r2 = r1[r5]
            r0[r3] = r2
            r2 = 5
            r1 = r1[r6]
            r0[r2] = r1
            java.util.concurrent.atomic.AtomicLong r1 = p056da.C1352d.f6882a
            long r1 = r1.incrementAndGet()
            byte[] r1 = m3854a(r1)
            r2 = r1[r5]
            r4 = 6
            r0[r4] = r2
            r1 = r1[r6]
            r2 = 7
            r0[r2] = r1
            int r1 = android.os.Process.myPid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            short r1 = r1.shortValue()
            long r1 = (long) r1
            byte[] r1 = m3854a(r1)
            r2 = r1[r5]
            r4 = 8
            r0[r4] = r2
            r1 = r1[r6]
            r2 = 9
            r0[r2] = r1
            java.lang.String r11 = r11.m3877c()
            java.lang.String r11 = p056da.C1354e.m3869m(r11)
            java.lang.String r0 = p056da.C1354e.m3866j(r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 12
            java.lang.String r4 = r0.substring(r5, r3)
            r2[r5] = r4
            r4 = 16
            java.lang.String r9 = r0.substring(r3, r4)
            r2[r6] = r9
            r6 = 20
            java.lang.CharSequence r0 = r0.subSequence(r4, r6)
            r2[r7] = r0
            java.lang.String r11 = r11.substring(r5, r3)
            r2[r8] = r11
            java.lang.String r11 = "%s%s%s%s"
            java.lang.String r11 = java.lang.String.format(r1, r11, r2)
            java.lang.String r11 = r11.toUpperCase(r1)
            p056da.C1352d.f6883b = r11
            return
    }

    /* renamed from: a */
    public static byte[] m3854a(long r1) {
            r0 = 2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r2 = (int) r1
            short r1 = (short) r2
            r0.putShort(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r1 = 0
            r0.position(r1)
            byte[] r1 = r0.array()
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = p056da.C1352d.f6883b
            return r0
    }
}

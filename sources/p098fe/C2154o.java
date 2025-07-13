package p098fe;

/* renamed from: fe.o */
/* loaded from: classes.dex */
public final class C2154o {

    /* renamed from: a */
    public final long f9885a;

    public C2154o(long r1) {
            r0 = this;
            r0.<init>()
            r0.f9885a = r1
            return
    }

    /* renamed from: a */
    public final java.lang.String m5701a(double r3) {
            r2 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.##"
            r0.<init>(r1)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.text.DecimalFormatSymbols r1 = java.text.DecimalFormatSymbols.getInstance(r1)
            r0.setDecimalFormatSymbols(r1)
            java.lang.String r3 = r0.format(r3)
            java.lang.String r4 = "precision.format(this)"
            p214m2.C4339q.m9705j(r3, r4)
            return r3
    }

    /* renamed from: b */
    public final java.lang.String m5702b() {
            r7 = this;
            long r0 = r7.f9885a
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r7.f9885a
            r0.append(r1)
            java.lang.String r1 = " \u00b5s"
            goto L7e
        L15:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r4 = 1000(0x3e8, float:1.401E-42)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r7.f9885a
            double r1 = (double) r1
            double r3 = (double) r4
            double r1 = r1 / r3
            java.lang.String r1 = r7.m5701a(r1)
            r0.append(r1)
            java.lang.String r1 = " ms"
            goto L7e
        L32:
            r2 = 60000000(0x3938700, double:2.96439388E-316)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r7.f9885a
            double r1 = (double) r1
            double r3 = (double) r4
            double r1 = r1 / r3
            double r1 = r1 / r3
            java.lang.String r1 = r7.m5701a(r1)
            r0.append(r1)
            java.lang.String r1 = " s"
            goto L7e
        L4e:
            r2 = 3600000000(0xd693a400, double:1.778636325E-314)
            r5 = 60
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r6 >= 0) goto L70
            long r1 = r7.f9885a
            double r1 = (double) r1
            double r3 = (double) r4
            double r1 = r1 / r3
            double r1 = r1 / r3
            double r3 = (double) r5
            double r1 = r1 / r3
            java.lang.String r1 = r7.m5701a(r1)
            r0.append(r1)
            java.lang.String r1 = " min"
            goto L7e
        L70:
            long r1 = r7.f9885a
            double r1 = (double) r1
            double r3 = (double) r4
            double r1 = r1 / r3
            double r1 = r1 / r3
            double r3 = (double) r5
            double r1 = r1 / r3
            double r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " h"
        L7e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p098fe.C2154o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fe.o r8 = (p098fe.C2154o) r8
            long r3 = r7.f9885a
            long r5 = r8.f9885a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f9885a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TimeCPU(microseconds="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f9885a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

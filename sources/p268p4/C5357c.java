package p268p4;

/* renamed from: p4.c */
/* loaded from: classes.dex */
public final class C5357c extends p268p4.AbstractC5358d {

    /* renamed from: b */
    public long f21284b;

    /* renamed from: c */
    public long[] f21285c;

    /* renamed from: d */
    public long[] f21286d;

    public C5357c() {
            r2 = this;
            m4.h r0 = new m4.h
            r0.<init>()
            r2.<init>(r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f21284b = r0
            r0 = 0
            long[] r1 = new long[r0]
            r2.f21285c = r1
            long[] r0 = new long[r0]
            r2.f21286d = r0
            return
    }

    /* renamed from: d */
    public static java.lang.Object m11663d(p371v5.C6571u r4, int r5) {
            if (r5 == 0) goto L82
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L76
            r1 = 2
            if (r5 == r1) goto L71
            r2 = 3
            if (r5 == r2) goto L55
            r2 = 8
            if (r5 == r2) goto L50
            r2 = 10
            if (r5 == r2) goto L34
            r0 = 11
            if (r5 == r0) goto L1a
            r4 = 0
            return r4
        L1a:
            java.util.Date r5 = new java.util.Date
            long r2 = r4.m13411n()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.m13397G(r1)
            return r5
        L34:
            int r5 = r4.m13421x()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L3d:
            if (r0 >= r5) goto L4f
            int r2 = r4.m13418u()
            java.lang.Object r2 = m11663d(r4, r2)
            if (r2 == 0) goto L4c
            r1.add(r2)
        L4c:
            int r0 = r0 + 1
            goto L3d
        L4f:
            return r1
        L50:
            java.util.HashMap r4 = m11664e(r4)
            return r4
        L55:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L5a:
            java.lang.String r0 = m11665f(r4)
            int r1 = r4.m13418u()
            r2 = 9
            if (r1 != r2) goto L67
            return r5
        L67:
            java.lang.Object r1 = m11663d(r4, r1)
            if (r1 == 0) goto L5a
            r5.put(r0, r1)
            goto L5a
        L71:
            java.lang.String r4 = m11665f(r4)
            return r4
        L76:
            int r4 = r4.m13418u()
            if (r4 != r1) goto L7d
            r0 = 1
        L7d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L82:
            long r4 = r4.m13411n()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
    }

    /* renamed from: e */
    public static java.util.HashMap<java.lang.String, java.lang.Object> m11664e(p371v5.C6571u r5) {
            int r0 = r5.m13421x()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L20
            java.lang.String r3 = m11665f(r5)
            int r4 = r5.m13418u()
            java.lang.Object r4 = m11663d(r5, r4)
            if (r4 == 0) goto L1d
            r1.put(r3, r4)
        L1d:
            int r2 = r2 + 1
            goto La
        L20:
            return r1
    }

    /* renamed from: f */
    public static java.lang.String m11665f(p371v5.C6571u r3) {
            int r0 = r3.m13423z()
            int r1 = r3.f25711b
            r3.m13397G(r0)
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r3.f25710a
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // p268p4.AbstractC5358d
    /* renamed from: b */
    public boolean mo11659b(p371v5.C6571u r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // p268p4.AbstractC5358d
    /* renamed from: c */
    public boolean mo11660c(p371v5.C6571u r10, long r11) {
            r9 = this;
            int r11 = r10.m13418u()
            r12 = 2
            r0 = 0
            if (r11 == r12) goto L9
            return r0
        L9:
            java.lang.String r11 = m11665f(r10)
            java.lang.String r12 = "onMetaData"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L16
            return r0
        L16:
            int r11 = r10.m13418u()
            r12 = 8
            if (r11 == r12) goto L1f
            return r0
        L1f:
            java.util.HashMap r10 = m11664e(r10)
            java.lang.String r11 = "duration"
            java.lang.Object r11 = r10.get(r11)
            boolean r12 = r11 instanceof java.lang.Double
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r12 == 0) goto L43
            java.lang.Double r11 = (java.lang.Double) r11
            double r11 = r11.doubleValue()
            r3 = 0
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto L43
            double r11 = r11 * r1
            long r11 = (long) r11
            r9.f21284b = r11
        L43:
            java.lang.String r11 = "keyframes"
            java.lang.Object r10 = r10.get(r11)
            boolean r11 = r10 instanceof java.util.Map
            if (r11 == 0) goto La8
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r11 = "filepositions"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r12 = "times"
            java.lang.Object r10 = r10.get(r12)
            boolean r12 = r11 instanceof java.util.List
            if (r12 == 0) goto La8
            boolean r12 = r10 instanceof java.util.List
            if (r12 == 0) goto La8
            java.util.List r11 = (java.util.List) r11
            java.util.List r10 = (java.util.List) r10
            int r12 = r10.size()
            long[] r3 = new long[r12]
            r9.f21285c = r3
            long[] r3 = new long[r12]
            r9.f21286d = r3
            r3 = 0
        L74:
            if (r3 >= r12) goto La8
            java.lang.Object r4 = r11.get(r3)
            java.lang.Object r5 = r10.get(r3)
            boolean r6 = r5 instanceof java.lang.Double
            if (r6 == 0) goto La0
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto La0
            long[] r6 = r9.f21285c
            java.lang.Double r5 = (java.lang.Double) r5
            double r7 = r5.doubleValue()
            double r7 = r7 * r1
            long r7 = (long) r7
            r6[r3] = r7
            long[] r5 = r9.f21286d
            java.lang.Double r4 = (java.lang.Double) r4
            long r6 = r4.longValue()
            r5[r3] = r6
            int r3 = r3 + 1
            goto L74
        La0:
            long[] r10 = new long[r0]
            r9.f21285c = r10
            long[] r10 = new long[r0]
            r9.f21286d = r10
        La8:
            return r0
    }
}

package p185k7;

/* renamed from: k7.b */
/* loaded from: classes.dex */
public final class C3738b {

    /* renamed from: a */
    public java.lang.String f16461a;

    /* renamed from: b */
    public final long f16462b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, java.lang.Object> f16463c;

    public C3738b(java.lang.String r1, long r2, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r0 = this;
            r0.<init>()
            r0.f16461a = r1
            r0.f16462b = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f16463c = r1
            if (r4 == 0) goto L13
            r1.putAll(r4)
        L13:
            return
    }

    /* renamed from: a */
    public final p185k7.C3738b m8218a() {
            r6 = this;
            k7.b r0 = new k7.b
            java.lang.String r1 = r6.f16461a
            long r2 = r6.f16462b
            java.util.HashMap r4 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f16463c
            r4.<init>(r5)
            r0.<init>(r1, r2, r4)
            return r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            k7.b r0 = r1.m8218a()
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r7 = 1
            return r7
        L4:
            boolean r0 = r7 instanceof p185k7.C3738b
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            k7.b r7 = (p185k7.C3738b) r7
            long r2 = r6.f16462b
            long r4 = r7.f16462b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            return r1
        L15:
            java.lang.String r0 = r6.f16461a
            java.lang.String r2 = r7.f16461a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.f16463c
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f16463c
            boolean r7 = r0.equals(r7)
            return r7
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f16461a
            int r0 = r0.hashCode()
            long r1 = r5.f16462b
            int r0 = r0 * 31
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.f16463c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.f16461a
            long r1 = r7.f16462b
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.f16463c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r5 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 55
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "Event{name='"
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = "', timestamp="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ", params="
            r6.append(r0)
            r6.append(r3)
            r0 = 125(0x7d, float:1.75E-43)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }
}

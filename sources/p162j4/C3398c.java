package p162j4;

/* renamed from: j4.c */
/* loaded from: classes.dex */
public final class C3398c {

    /* renamed from: a */
    public final java.lang.Object f14723a;

    /* renamed from: b */
    public p088f4.C2018j0.f f14724b;

    /* renamed from: c */
    public p162j4.InterfaceC3405j f14725c;

    public C3398c() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f14723a = r0
            return
    }

    /* renamed from: a */
    public final p162j4.InterfaceC3405j m7820a(p088f4.C2018j0.f r17) {
            r16 = this;
            r0 = r17
            u5.q$b r1 = new u5.q$b
            r1.<init>()
            r2 = 0
            r1.f24776b = r2
            j4.v r6 = new j4.v
            android.net.Uri r3 = r0.f8999b
            if (r3 != 0) goto L12
            r3 = r2
            goto L16
        L12:
            java.lang.String r3 = r3.toString()
        L16:
            boolean r4 = r0.f9003f
            r6.<init>(r3, r4, r1)
            b9.o<java.lang.String, java.lang.String> r1 = r0.f9000c
            b9.p r1 = r1.m2319e()
            b9.m0 r1 = r1.mo2270n()
        L25:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Objects.requireNonNull(r4)
            java.util.Objects.requireNonNull(r3)
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.f14769d
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f14769d     // Catch: java.lang.Throwable -> L4d
            r7.put(r4, r3)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            goto L25
        L4d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r0
        L50:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.UUID r1 = p088f4.C2017j.f8967d
            int r1 = p162j4.C3416u.f14762d
            u5.s r11 = new u5.s
            r11.<init>()
            r12 = 300000(0x493e0, double:1.482197E-318)
            java.util.UUID r4 = r0.f8998a
            j4.t r5 = p162j4.C3415t.f14761a
            java.util.Objects.requireNonNull(r4)
            boolean r8 = r0.f9001d
            boolean r10 = r0.f9002e
            b9.n<java.lang.Integer> r1 = r0.f9004g
            int[] r1 = p074e9.C1806b.m4544w(r1)
            int r3 = r1.length
            r9 = 0
        L74:
            if (r9 >= r3) goto L87
            r14 = r1[r9]
            r2 = 2
            r15 = 1
            if (r14 == r2) goto L80
            if (r14 != r15) goto L7f
            goto L80
        L7f:
            r15 = 0
        L80:
            p371v5.C6549a.m13288b(r15)
            int r9 = r9 + 1
            r2 = 0
            goto L74
        L87:
            java.lang.Object r1 = r1.clone()
            r9 = r1
            int[] r9 = (int[]) r9
            j4.b r1 = new j4.b
            r14 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)
            byte[] r0 = r0.f9005h
            if (r0 == 0) goto L9f
            int r2 = r0.length
            byte[] r2 = java.util.Arrays.copyOf(r0, r2)
            goto La0
        L9f:
            r2 = 0
        La0:
            java.util.List<j4.a> r0 = r1.f14702m
            boolean r0 = r0.isEmpty()
            p371v5.C6549a.m13291e(r0)
            r0 = 0
            r1.f14711v = r0
            r1.f14712w = r2
            return r1
    }
}

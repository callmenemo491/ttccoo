package p185k7;

/* renamed from: k7.e6 */
/* loaded from: classes.dex */
public final class C3787e6 extends p185k7.AbstractC3822h {

    /* renamed from: a0 */
    public final /* synthetic */ int f16614a0;

    /* renamed from: b0 */
    public final java.lang.Object f16615b0;

    public C3787e6(androidx.appcompat.widget.C0311x r2) {
            r1 = this;
            r0 = 3
            r1.f16614a0 = r0
            java.lang.String r0 = "internal.registerCallback"
            r1.<init>(r0)
            r1.f16615b0 = r2
            return
    }

    public C3787e6(androidx.fragment.app.C0392l0 r2) {
            r1 = this;
            r0 = 0
            r1.f16614a0 = r0
            java.lang.String r0 = "internal.eventLogger"
            r1.<init>(r0)
            r1.f16615b0 = r2
            return
    }

    public C3787e6(java.util.concurrent.Callable r2) {
            r1 = this;
            r0 = 2
            r1.f16614a0 = r0
            java.lang.String r0 = "internal.appMetadata"
            r1.<init>(r0)
            r1.f16615b0 = r2
            return
    }

    public C3787e6(p249o7.C5153z3 r6) {
            r5 = this;
            r0 = 1
            r5.f16614a0 = r0
            java.lang.String r1 = "internal.logger"
            r5.<init>(r1)
            r5.f16615b0 = r6
            java.util.Map<java.lang.String, k7.o> r6 = r5.f16657Z
            k7.gc r1 = new k7.gc
            r2 = 0
            r1.<init>(r5, r2, r0)
            java.lang.String r3 = "log"
            r6.put(r3, r1)
            java.util.Map<java.lang.String, k7.o> r6 = r5.f16657Z
            k7.pa r1 = new k7.pa
            r1.<init>()
            java.lang.String r4 = "silent"
            r6.put(r4, r1)
            java.util.Map<java.lang.String, k7.o> r6 = r5.f16657Z
            java.lang.Object r6 = r6.get(r4)
            k7.h r6 = (p185k7.AbstractC3822h) r6
            k7.gc r1 = new k7.gc
            r1.<init>(r5, r0, r0)
            java.util.Map<java.lang.String, k7.o> r6 = r6.f16657Z
            r6.put(r3, r1)
            java.util.Map<java.lang.String, k7.o> r6 = r5.f16657Z
            k7.qb r0 = new k7.qb
            r0.<init>()
            java.lang.String r1 = "unmonitored"
            r6.put(r1, r0)
            java.util.Map<java.lang.String, k7.o> r6 = r5.f16657Z
            java.lang.Object r6 = r6.get(r1)
            k7.h r6 = (p185k7.AbstractC3822h) r6
            k7.gc r0 = new k7.gc
            r0.<init>(r5, r2, r2)
            java.util.Map<java.lang.String, k7.o> r6 = r6.f16657Z
            r6.put(r3, r0)
            return
    }

    @Override // p185k7.AbstractC3822h
    /* renamed from: b */
    public final p185k7.InterfaceC3916o mo8522b(p365v.C6476c r6, java.util.List r7) {
            r5 = this;
            int r0 = r5.f16614a0
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L1a;
                case 2: goto La;
                default: goto L9;
            }
        L9:
            goto L74
        La:
            java.lang.Object r6 = r5.f16615b0     // Catch: java.lang.Exception -> L17
            java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6     // Catch: java.lang.Exception -> L17
            java.lang.Object r6 = r6.call()     // Catch: java.lang.Exception -> L17
            k7.o r6 = p052d6.C1306f0.m3780i(r6)     // Catch: java.lang.Exception -> L17
            goto L19
        L17:
            k7.o r6 = p185k7.InterfaceC3916o.f16782G
        L19:
            return r6
        L1a:
            k7.o r6 = p185k7.InterfaceC3916o.f16782G
            return r6
        L1d:
            java.lang.String r0 = r5.f16656Y
            p124h7.C2939x3.m7264N(r0, r4, r7)
            java.lang.Object r0 = r7.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r6.m13117i(r0)
            java.lang.String r0 = r0.mo8357i()
            java.lang.Object r2 = r7.get(r2)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r6.m13117i(r2)
            java.lang.Double r2 = r2.mo8355g()
            double r2 = r2.doubleValue()
            double r2 = p124h7.C2939x3.m7290p(r2)
            long r2 = (long) r2
            java.lang.Object r7 = r7.get(r1)
            k7.o r7 = (p185k7.InterfaceC3916o) r7
            k7.o r6 = r6.m13117i(r7)
            boolean r7 = r6 instanceof p185k7.C3877l
            if (r7 == 0) goto L5c
            k7.l r6 = (p185k7.C3877l) r6
            java.util.Map r6 = p124h7.C2939x3.m7262L(r6)
            goto L61
        L5c:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
        L61:
            java.lang.Object r7 = r5.f16615b0
            androidx.fragment.app.l0 r7 = (androidx.fragment.app.C0392l0) r7
            java.lang.Object r7 = r7.f2232b0
            java.util.List r7 = (java.util.List) r7
            k7.b r1 = new k7.b
            r1.<init>(r0, r2, r6)
            r7.add(r1)
            k7.o r6 = p185k7.InterfaceC3916o.f16782G
            return r6
        L74:
            java.lang.String r0 = r5.f16656Y
            p124h7.C2939x3.m7264N(r0, r4, r7)
            java.lang.Object r0 = r7.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r6.m13117i(r0)
            r0.mo8357i()
            java.lang.Object r0 = r7.get(r2)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r6.m13117i(r0)
            boolean r3 = r0 instanceof p185k7.C3903n
            if (r3 == 0) goto L13e
            java.lang.Object r7 = r7.get(r1)
            k7.o r7 = (p185k7.InterfaceC3916o) r7
            k7.o r6 = r6.m13117i(r7)
            boolean r7 = r6 instanceof p185k7.C3877l
            if (r7 == 0) goto L136
            k7.l r6 = (p185k7.C3877l) r6
            java.util.Map<java.lang.String, k7.o> r7 = r6.f16729Y
            java.lang.String r1 = "type"
            boolean r7 = r7.containsKey(r1)
            if (r7 == 0) goto L12e
            k7.o r7 = r6.mo8358l(r1)
            java.lang.String r7 = r7.mo8357i()
            java.util.Map<java.lang.String, k7.o> r1 = r6.f16729Y
            java.lang.String r3 = "priority"
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto Ld1
            k7.o r6 = r6.mo8358l(r3)
            java.lang.Double r6 = r6.mo8355g()
            double r3 = r6.doubleValue()
            int r6 = p124h7.C2939x3.m7296v(r3)
            goto Ld3
        Ld1:
            r6 = 1000(0x3e8, float:1.401E-42)
        Ld3:
            java.lang.Object r1 = r5.f16615b0
            androidx.appcompat.widget.x r1 = (androidx.appcompat.widget.C0311x) r1
            k7.n r0 = (p185k7.C3903n) r0
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "create"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto Le7
            java.lang.Object r7 = r1.f1482a0
            goto Lf1
        Le7:
            java.lang.String r3 = "edit"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L112
            java.lang.Object r7 = r1.f1481Z
        Lf1:
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L108
            java.lang.Object r6 = r7.lastKey()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r2
        L108:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.put(r6, r0)
            k7.o r6 = p185k7.InterfaceC3916o.f16782G
            return r6
        L112:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Unknown callback type: "
            int r1 = r7.length()
            if (r1 == 0) goto L125
            java.lang.String r7 = r0.concat(r7)
            goto L12a
        L125:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
        L12a:
            r6.<init>(r7)
            throw r6
        L12e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Undefined rule type"
            r6.<init>(r7)
            throw r6
        L136:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid callback params"
            r6.<init>(r7)
            throw r6
        L13e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid callback type"
            r6.<init>(r7)
            throw r6
    }
}

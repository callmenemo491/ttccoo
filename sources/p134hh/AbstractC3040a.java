package p134hh;

/* renamed from: hh.a */
/* loaded from: classes.dex */
public abstract class AbstractC3040a implements p101fh.InterfaceC2172d<java.lang.Object>, p134hh.InterfaceC3043d, java.io.Serializable {

    /* renamed from: Y */
    public final p101fh.InterfaceC2172d<java.lang.Object> f12242Y;

    public AbstractC3040a(p101fh.InterfaceC2172d<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.f12242Y = r1
            return
    }

    /* renamed from: h */
    public p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r1, p101fh.InterfaceC2172d<?> r2) {
            r0 = this;
            java.lang.String r1 = "completion"
            p214m2.C4339q.m9706k(r2, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    @Override // p134hh.InterfaceC3043d
    /* renamed from: j */
    public p134hh.InterfaceC3043d mo5742j() {
            r2 = this;
            fh.d<java.lang.Object> r0 = r2.f12242Y
            boolean r1 = r0 instanceof p134hh.InterfaceC3043d
            if (r1 == 0) goto L9
            hh.d r0 = (p134hh.InterfaceC3043d) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: k */
    public final void mo5707k(java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            java.lang.String r1 = "frame"
            p214m2.C4339q.m9706k(r0, r1)
            hh.a r0 = (p134hh.AbstractC3040a) r0
            fh.d<java.lang.Object> r1 = r0.f12242Y
            p214m2.C4339q.m9704i(r1)
            java.lang.Object r4 = r0.mo123o(r4)     // Catch: java.lang.Throwable -> L16
            gh.a r2 = gh.EnumC2389a.f10764Y     // Catch: java.lang.Throwable -> L16
            if (r4 != r2) goto L1b
            return
        L16:
            r4 = move-exception
            java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
        L1b:
            r0.mo7450s()
            boolean r0 = r1 instanceof p134hh.AbstractC3040a
            if (r0 == 0) goto L24
            r0 = r1
            goto L1
        L24:
            r1.mo5707k(r4)
            return
    }

    /* renamed from: n */
    public java.lang.StackTraceElement mo7449n() {
            r9 = this;
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.Class<hh.e> r1 = p134hh.InterfaceC3044e.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            hh.e r0 = (p134hh.InterfaceC3044e) r0
            r1 = 0
            if (r0 != 0) goto L16
            goto Lff
        L16:
            int r2 = r0.m7455v()
            r3 = 1
            if (r2 > r3) goto L100
            r2 = -1
            r4 = 0
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.Exception -> L42
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Exception -> L42
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L42
            java.lang.Object r5 = r5.get(r9)     // Catch: java.lang.Exception -> L42
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L42
            if (r6 == 0) goto L37
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L42
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 == 0) goto L3f
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L42
            goto L40
        L3f:
            r5 = 0
        L40:
            int r5 = r5 - r3
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 >= 0) goto L46
            goto L4c
        L46:
            int[] r2 = r0.m7453l()
            r2 = r2[r5]
        L4c:
            java.lang.String r3 = "continuation"
            p214m2.C4339q.m9706k(r9, r3)
            hh.f$a r3 = p134hh.C3045f.f12247b
            if (r3 != 0) goto L98
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L94
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> L94
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.Exception -> L94
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L94
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.Exception -> L94
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L94
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> L94
            java.lang.Class r6 = r9.getClass()     // Catch: java.lang.Exception -> L94
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L94
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L94
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L94
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch: java.lang.Exception -> L94
            hh.f$a r7 = new hh.f$a     // Catch: java.lang.Exception -> L94
            r7.<init>(r3, r5, r6)     // Catch: java.lang.Exception -> L94
            p134hh.C3045f.f12247b = r7     // Catch: java.lang.Exception -> L94
            r3 = r7
            goto L98
        L94:
            hh.f$a r3 = p134hh.C3045f.f12246a
            p134hh.C3045f.f12247b = r3
        L98:
            hh.f$a r5 = p134hh.C3045f.f12246a
            if (r3 != r5) goto L9d
            goto Ld2
        L9d:
            java.lang.reflect.Method r5 = r3.f12248a
            if (r5 == 0) goto Lac
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = r5.invoke(r6, r7)
            goto Lad
        Lac:
            r5 = r1
        Lad:
            if (r5 != 0) goto Lb0
            goto Ld2
        Lb0:
            java.lang.reflect.Method r6 = r3.f12249b
            if (r6 == 0) goto Lbb
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = r6.invoke(r5, r7)
            goto Lbc
        Lbb:
            r5 = r1
        Lbc:
            if (r5 != 0) goto Lbf
            goto Ld2
        Lbf:
            java.lang.reflect.Method r3 = r3.f12250c
            if (r3 == 0) goto Lca
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r3 = r3.invoke(r5, r4)
            goto Lcb
        Lca:
            r3 = r1
        Lcb:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto Ld2
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
        Ld2:
            if (r1 != 0) goto Ld9
            java.lang.String r1 = r0.m7451c()
            goto Lf1
        Ld9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            java.lang.String r1 = r0.m7451c()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        Lf1:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r0.m7454m()
            java.lang.String r0 = r0.m7452f()
            r3.<init>(r1, r4, r0, r2)
            r1 = r3
        Lff:
            return r1
        L100:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Debug metadata version mismatch. Expected: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = ", got "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ". Please update the Kotlin standard library."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: o */
    public abstract java.lang.Object mo123o(java.lang.Object r1);

    /* renamed from: s */
    public void mo7450s() {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Continuation at "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.StackTraceElement r1 = r2.mo7449n()
            if (r1 == 0) goto Ld
            goto L15
        Ld:
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L15:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package p385w3;

/* renamed from: w3.m */
/* loaded from: classes.dex */
public class C6791m implements p385w3.InterfaceC6790l {

    /* renamed from: e */
    public static volatile p385w3.AbstractC6792n f26342e;

    /* renamed from: a */
    public final p050d4.InterfaceC1277a f26343a;

    /* renamed from: b */
    public final p050d4.InterfaceC1277a f26344b;

    /* renamed from: c */
    public final p446z3.InterfaceC7245c f26345c;

    /* renamed from: d */
    public final p005a4.C0020i f26346d;

    public C6791m(p050d4.InterfaceC1277a r1, p050d4.InterfaceC1277a r2, p446z3.InterfaceC7245c r3, p005a4.C0020i r4, p005a4.C0022k r5) {
            r0 = this;
            r0.<init>()
            r0.f26343a = r1
            r0.f26344b = r2
            r0.f26345c = r3
            r0.f26346d = r4
            java.util.concurrent.Executor r1 = r5.f51a
            f1.f r2 = new f1.f
            r2.<init>(r5)
            r1.execute(r2)
            return
    }

    /* renamed from: a */
    public static p385w3.C6791m m13810a() {
            w3.n r0 = p385w3.C6791m.f26342e
            if (r0 == 0) goto Lf
            w3.c r0 = (p385w3.C6781c) r0
            bh.a<w3.m> r0 = r0.f26328c0
            java.lang.Object r0 = r0.get()
            w3.m r0 = (p385w3.C6791m) r0
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized!"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static void m13811b(android.content.Context r3) {
            w3.n r0 = p385w3.C6791m.f26342e
            if (r0 != 0) goto L1d
            java.lang.Class<w3.m> r0 = p385w3.C6791m.class
            monitor-enter(r0)
            w3.n r1 = p385w3.C6791m.f26342e     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L18
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            w3.c r1 = new w3.c     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1a
            p385w3.C6791m.f26342e = r1     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L1d:
            return
    }

    /* renamed from: c */
    public p335t3.InterfaceC6154g m13812c(p385w3.InterfaceC6782d r5) {
            r4 = this;
            w3.j r0 = new w3.j
            boolean r1 = r5 instanceof p385w3.InterfaceC6782d
            if (r1 == 0) goto L13
            r1 = r5
            u3.a r1 = (p350u3.C6292a) r1
            java.util.Objects.requireNonNull(r1)
            java.util.Set<t3.b> r1 = p350u3.C6292a.f24539d
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            goto L1e
        L13:
            t3.b r1 = new t3.b
            java.lang.String r2 = "proto"
            r1.<init>(r2)
            java.util.Set r1 = java.util.Collections.singleton(r1)
        L1e:
            w3.i$a r2 = p385w3.AbstractC6787i.m13808a()
            java.util.Objects.requireNonNull(r5)
            java.lang.String r3 = "cct"
            r2.mo13802b(r3)
            u3.a r5 = (p350u3.C6292a) r5
            byte[] r5 = r5.m12925b()
            w3.b$b r2 = (p385w3.C6780b.b) r2
            r2.f26322b = r5
            w3.i r5 = r2.mo13801a()
            r0.<init>(r1, r5, r4)
            return r0
    }
}

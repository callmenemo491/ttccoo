package p179k1;

/* renamed from: k1.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC3641a0 {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicBoolean f16048a;

    /* renamed from: b */
    public final p179k1.AbstractC3664v f16049b;

    /* renamed from: c */
    public volatile p243o1.InterfaceC4876f f16050c;

    public AbstractC3641a0(p179k1.AbstractC3664v r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f16048a = r0
            r2.f16049b = r3
            return
    }

    /* renamed from: a */
    public p243o1.InterfaceC4876f m8076a() {
            r3 = this;
            k1.v r0 = r3.f16049b
            r0.m8109a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f16048a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1c
            o1.f r0 = r3.f16050c
            if (r0 != 0) goto L19
            o1.f r0 = r3.m8077b()
            r3.f16050c = r0
        L19:
            o1.f r0 = r3.f16050c
            goto L20
        L1c:
            o1.f r0 = r3.m8077b()
        L20:
            return r0
    }

    /* renamed from: b */
    public final p243o1.InterfaceC4876f m8077b() {
            r2 = this;
            java.lang.String r0 = r2.mo7438c()
            k1.v r1 = r2.f16049b
            r1.m8109a()
            r1.m8110b()
            o1.c r1 = r1.f16190d
            o1.a r1 = r1.mo8083o0()
            o1.f r0 = r1.mo11019y(r0)
            return r0
    }

    /* renamed from: c */
    public abstract java.lang.String mo7438c();

    /* renamed from: d */
    public void m8078d(p243o1.InterfaceC4876f r2) {
            r1 = this;
            o1.f r0 = r1.f16050c
            if (r2 != r0) goto La
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f16048a
            r0 = 0
            r2.set(r0)
        La:
            return
    }
}

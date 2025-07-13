package androidx.lifecycle;

/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a */
    public final androidx.lifecycle.InterfaceC0468t f2429a;

    /* renamed from: b */
    public final androidx.lifecycle.AbstractC0458o f2430b;

    /* renamed from: c */
    public final androidx.lifecycle.AbstractC0458o.c f2431c;

    /* renamed from: d */
    public final androidx.lifecycle.C0448j f2432d;

    public LifecycleController(androidx.lifecycle.AbstractC0458o r2, androidx.lifecycle.AbstractC0458o.c r3, androidx.lifecycle.C0448j r4, p379vh.InterfaceC6687b1 r5) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "minState"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "dispatchQueue"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f2430b = r2
            r1.f2431c = r3
            r1.f2432d = r4
            androidx.lifecycle.LifecycleController$observer$1 r3 = new androidx.lifecycle.LifecycleController$observer$1
            r3.<init>(r1, r5)
            r1.f2429a = r3
            r4 = r2
            androidx.lifecycle.w r4 = (androidx.lifecycle.C0472w) r4
            androidx.lifecycle.o$c r4 = r4.f2564c
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            if (r4 != r0) goto L30
            r2 = 0
            r5.mo13553d0(r2)
            r1.m1405a()
            goto L33
        L30:
            r2.mo1454a(r3)
        L33:
            return
    }

    /* renamed from: a */
    public final void m1405a() {
            r2 = this;
            androidx.lifecycle.o r0 = r2.f2430b
            androidx.lifecycle.t r1 = r2.f2429a
            r0.mo1455b(r1)
            androidx.lifecycle.j r0 = r2.f2432d
            r1 = 1
            r0.f2524b = r1
            r0.m1438b()
            return
    }
}

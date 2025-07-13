package p005a4;

/* renamed from: a4.i */
/* loaded from: classes.dex */
public class C0020i {

    /* renamed from: a */
    public final android.content.Context f37a;

    /* renamed from: b */
    public final p405x3.InterfaceC6922d f38b;

    /* renamed from: c */
    public final p021b4.InterfaceC0666c f39c;

    /* renamed from: d */
    public final p005a4.InterfaceC0023l f40d;

    /* renamed from: e */
    public final java.util.concurrent.Executor f41e;

    /* renamed from: f */
    public final p034c4.InterfaceC0867b f42f;

    /* renamed from: g */
    public final p050d4.InterfaceC1277a f43g;

    public C0020i(android.content.Context r1, p405x3.InterfaceC6922d r2, p021b4.InterfaceC0666c r3, p005a4.InterfaceC0023l r4, java.util.concurrent.Executor r5, p034c4.InterfaceC0867b r6, p050d4.InterfaceC1277a r7) {
            r0 = this;
            r0.<init>()
            r0.f37a = r1
            r0.f38b = r2
            r0.f39c = r3
            r0.f40d = r4
            r0.f41e = r5
            r0.f42f = r6
            r0.f43g = r7
            return
    }

    /* renamed from: a */
    public void m26a(p385w3.AbstractC6787i r11, int r12) {
            r10 = this;
            x3.d r0 = r10.f38b
            java.lang.String r1 = r11.mo13798b()
            x3.h r0 = r0.mo14027a(r1)
            r1 = 0
            r7 = r1
        Ld:
            c4.b r1 = r10.f42f
            a4.d r2 = new a4.d
            r3 = 0
            r2.<init>(r10, r11, r3)
            java.lang.Object r1 = r1.mo2235a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lac
            c4.b r1 = r10.f42f
            a4.d r2 = new a4.d
            r9 = 1
            r2.<init>(r10, r11, r9)
            java.lang.Object r1 = r1.mo2235a(r2)
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r1 = r5.iterator()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L3b
            return
        L3b:
            if (r0 != 0) goto L49
            java.lang.String r1 = "Uploader"
            java.lang.String r2 = "Unknown backend for %s, deleting event batch for it..."
            p064e.C1494h.m4052c(r1, r2, r11)
            com.google.android.datatransport.runtime.backends.c r1 = com.google.android.datatransport.runtime.backends.AbstractC1039c.m2805a()
            goto L74
        L49:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L52:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            b4.h r3 = (p021b4.AbstractC0671h) r3
            w3.f r3 = r3.mo2221a()
            r1.add(r3)
            goto L52
        L66:
            byte[] r2 = r11.mo13799c()
            x3.a r3 = new x3.a
            r4 = 0
            r3.<init>(r1, r2, r4)
            com.google.android.datatransport.runtime.backends.c r1 = r0.mo12929b(r3)
        L74:
            com.google.android.datatransport.runtime.backends.c$a r2 = r1.mo2802c()
            com.google.android.datatransport.runtime.backends.c$a r3 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5232Z
            if (r2 != r3) goto L90
            c4.b r0 = r10.f42f
            a4.g r1 = new a4.g
            r3 = r1
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7)
            r0.mo2235a(r1)
            a4.l r0 = r10.f40d
            int r12 = r12 + r9
            r0.mo21a(r11, r12, r9)
            return
        L90:
            c4.b r2 = r10.f42f
            f1.g0 r3 = new f1.g0
            r3.<init>(r10, r5)
            r2.mo2235a(r3)
            com.google.android.datatransport.runtime.backends.c$a r2 = r1.mo2802c()
            com.google.android.datatransport.runtime.backends.c$a r3 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5231Y
            if (r2 != r3) goto Ld
            long r1 = r1.mo2801b()
            long r7 = java.lang.Math.max(r7, r1)
            goto Ld
        Lac:
            c4.b r12 = r10.f42f
            a4.f r0 = new a4.f
            r0.<init>(r10, r11, r7)
            r12.mo2235a(r0)
            return
    }
}

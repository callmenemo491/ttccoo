package p082ek;

/* renamed from: ek.a0 */
/* loaded from: classes.dex */
public class C1883a0 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a */
    public final p082ek.C1908u f8143a;

    /* renamed from: b */
    public final java.lang.Object[] f8144b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Class f8145c;

    /* renamed from: d */
    public final /* synthetic */ p082ek.C1885b0 f8146d;

    public C1883a0(p082ek.C1885b0 r1, java.lang.Class r2) {
            r0 = this;
            r0.f8146d = r1
            r0.f8145c = r2
            r0.<init>()
            ek.u r1 = p082ek.C1908u.f8250c
            r0.f8143a = r1
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f8144b = r1
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) {
            r2 = this;
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Ld
            java.lang.Object r3 = r4.invoke(r2, r5)
            return r3
        Ld:
            if (r5 == 0) goto L10
            goto L12
        L10:
            java.lang.Object[] r5 = r2.f8144b
        L12:
            ek.u r0 = r2.f8143a
            boolean r0 = r0.f8251a
            if (r0 == 0) goto L20
            boolean r0 = r4.isDefault()
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L2c
            ek.u r0 = r2.f8143a
            java.lang.Class r1 = r2.f8145c
            java.lang.Object r3 = r0.mo4686b(r4, r1, r3, r5)
            goto L36
        L2c:
            ek.b0 r3 = r2.f8146d
            ek.c0 r3 = r3.m4649b(r4)
            java.lang.Object r3 = r3.mo4657a(r5)
        L36:
            return r3
    }
}

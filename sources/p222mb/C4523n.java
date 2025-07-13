package p222mb;

/* renamed from: mb.n */
/* loaded from: classes.dex */
public final class C4523n<T> extends p169jb.AbstractC3483z<T> {

    /* renamed from: a */
    public final p169jb.C3467j f18368a;

    /* renamed from: b */
    public final p169jb.AbstractC3483z<T> f18369b;

    /* renamed from: c */
    public final java.lang.reflect.Type f18370c;

    public C4523n(p169jb.C3467j r1, p169jb.AbstractC3483z<T> r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.f18368a = r1
            r0.f18369b = r2
            r0.f18370c = r3
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public T mo7919a(p290qb.C5612a r2) {
            r1 = this;
            jb.z<T> r0 = r1.f18369b
            java.lang.Object r2 = r0.mo7919a(r2)
            return r2
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r4, T r5) {
            r3 = this;
            jb.z<T> r0 = r3.f18369b
            java.lang.reflect.Type r1 = r3.f18370c
            if (r5 == 0) goto L16
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L12
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 != 0) goto L12
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L16
        L12:
            java.lang.Class r1 = r5.getClass()
        L16:
            java.lang.reflect.Type r2 = r3.f18370c
            if (r1 == r2) goto L31
            jb.j r0 = r3.f18368a
            pb.a r2 = new pb.a
            r2.<init>(r1)
            jb.z r0 = r0.m7931e(r2)
            boolean r1 = r0 instanceof p222mb.C4519j.a
            if (r1 != 0) goto L2a
            goto L31
        L2a:
            jb.z<T> r1 = r3.f18369b
            boolean r2 = r1 instanceof p222mb.C4519j.a
            if (r2 != 0) goto L31
            r0 = r1
        L31:
            r0.mo7920b(r4, r5)
            return
    }
}

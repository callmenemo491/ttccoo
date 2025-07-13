package p082ek;

/* renamed from: ek.z */
/* loaded from: classes.dex */
public final class C1913z<T> {

    /* renamed from: a */
    public final bi.C0783g0 f8305a;

    /* renamed from: b */
    public final T f8306b;

    /* renamed from: c */
    public final bi.AbstractC0785h0 f8307c;

    public C1913z(bi.C0783g0 r1, T r2, bi.AbstractC0785h0 r3) {
            r0 = this;
            r0.<init>()
            r0.f8305a = r1
            r0.f8306b = r2
            r0.f8307c = r3
            return
    }

    /* renamed from: b */
    public static <T> p082ek.C1913z<T> m4696b(T r2, bi.C0783g0 r3) {
            boolean r0 = r3.m2381h()
            if (r0 == 0) goto Ld
            ek.z r0 = new ek.z
            r1 = 0
            r0.<init>(r3, r2, r1)
            return r0
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "rawResponse must be successful response"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public boolean m4697a() {
            r1 = this;
            bi.g0 r0 = r1.f8305a
            boolean r0 = r0.m2381h()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            bi.g0 r0 = r1.f8305a
            java.lang.String r0 = r0.toString()
            return r0
    }
}

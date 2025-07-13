package p218m6;

import p201l6.C4181a.c;

/* renamed from: m6.b */
/* loaded from: classes.dex */
public final class C4388b<O extends p201l6.C4181a.c> {

    /* renamed from: a */
    public final int f17954a;

    /* renamed from: b */
    public final p201l6.C4181a<O> f17955b;

    /* renamed from: c */
    public final O f17956c;

    /* renamed from: d */
    public final java.lang.String f17957d;

    public C4388b(p201l6.C4181a<O> r3, O r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.f17955b = r3
            r2.f17956c = r4
            r2.f17957d = r5
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            int r3 = java.util.Arrays.hashCode(r0)
            r2.f17954a = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p218m6.C4388b
            if (r2 != 0) goto Ld
            return r0
        Ld:
            m6.b r5 = (p218m6.C4388b) r5
            l6.a<O extends l6.a$c> r2 = r4.f17955b
            l6.a<O extends l6.a$c> r3 = r5.f17955b
            boolean r2 = p248o6.C4924o.m11074a(r2, r3)
            if (r2 == 0) goto L2e
            O extends l6.a$c r2 = r4.f17956c
            O extends l6.a$c r3 = r5.f17956c
            boolean r2 = p248o6.C4924o.m11074a(r2, r3)
            if (r2 == 0) goto L2e
            java.lang.String r2 = r4.f17957d
            java.lang.String r5 = r5.f17957d
            boolean r5 = p248o6.C4924o.m11074a(r2, r5)
            if (r5 == 0) goto L2e
            return r1
        L2e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f17954a
            return r0
    }
}

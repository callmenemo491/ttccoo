package p093f9;

/* renamed from: f9.f */
/* loaded from: classes.dex */
public final class C2088f {

    /* renamed from: a */
    public final p204l9.C4231y f9506a;

    public C2088f(p204l9.C4231y r1) {
            r0 = this;
            r0.<init>()
            r0.f9506a = r1
            return
    }

    /* renamed from: a */
    public static p093f9.C2088f m5513a(java.lang.String r3, byte[] r4, int r5) {
            f9.f r0 = new f9.f
            l9.y$b r1 = p204l9.C4231y.m9533E()
            r1.m10377o()
            MessageType extends m9.x<MessageType, BuilderType> r2 = r1.f18293Z
            l9.y r2 = (p204l9.C4231y) r2
            p204l9.C4231y.m9535x(r2, r3)
            int r3 = r4.length
            r2 = 0
            m9.h r3 = p221m9.AbstractC4454h.m10054i(r4, r2, r3)
            r1.m10377o()
            MessageType extends m9.x<MessageType, BuilderType> r4 = r1.f18293Z
            l9.y r4 = (p204l9.C4231y) r4
            p204l9.C4231y.m9536y(r4, r3)
            int r3 = p365v.C6480g.m13148b(r5)
            if (r3 == 0) goto L40
            r4 = 1
            if (r3 == r4) goto L3d
            r4 = 2
            if (r3 == r4) goto L3a
            r4 = 3
            if (r3 != r4) goto L32
            l9.g0 r3 = p204l9.EnumC4210g0.f17365d0
            goto L42
        L32:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unknown output prefix type"
            r3.<init>(r4)
            throw r3
        L3a:
            l9.g0 r3 = p204l9.EnumC4210g0.f17364c0
            goto L42
        L3d:
            l9.g0 r3 = p204l9.EnumC4210g0.f17363b0
            goto L42
        L40:
            l9.g0 r3 = p204l9.EnumC4210g0.f17362a0
        L42:
            r1.m10377o()
            MessageType extends m9.x<MessageType, BuilderType> r4 = r1.f18293Z
            l9.y r4 = (p204l9.C4231y) r4
            p204l9.C4231y.m9537z(r4, r3)
            m9.x r3 = r1.m10375k()
            l9.y r3 = (p204l9.C4231y) r3
            r0.<init>(r3)
            return r0
    }
}

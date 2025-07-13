package p439yh;

/* renamed from: yh.i */
/* loaded from: classes.dex */
public final class C7212i extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Integer, p101fh.InterfaceC2175g.a, java.lang.Integer> {

    /* renamed from: Z */
    public final /* synthetic */ p439yh.C7210g<?> f27759Z;

    public C7212i(p439yh.C7210g<?> r1) {
            r0 = this;
            r0.f27759Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Integer mo122l(java.lang.Integer r4, p101fh.InterfaceC2175g.a r5) {
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            fh.g$a r5 = (p101fh.InterfaceC2175g.a) r5
            fh.g$b r0 = r5.getKey()
            yh.g<?> r1 = r3.f27759Z
            fh.g r1 = r1.f27752c0
            fh.g$a r1 = r1.get(r0)
            int r2 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r2 = p379vh.InterfaceC6687b1.b.f25958Y
            if (r0 == r2) goto L26
            if (r5 == r1) goto L1f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L1f:
            int r4 = r4 + 1
        L21:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L3b
        L26:
            vh.b1 r1 = (p379vh.InterfaceC6687b1) r1
            vh.b1 r5 = (p379vh.InterfaceC6687b1) r5
        L2a:
            r0 = 0
            if (r5 != 0) goto L2f
            r5 = r0
            goto L36
        L2f:
            if (r5 != r1) goto L32
            goto L36
        L32:
            boolean r2 = r5 instanceof p459zh.C7349o
            if (r2 != 0) goto L64
        L36:
            if (r5 != r1) goto L3c
            if (r1 != 0) goto L1f
            goto L21
        L3b:
            return r4
        L3c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = ", expected child of "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L64:
            zh.o r5 = (p459zh.C7349o) r5
            vh.m r5 = r5.m13572B()
            if (r5 != 0) goto L6e
            r5 = r0
            goto L2a
        L6e:
            vh.b1 r5 = r5.getParent()
            goto L2a
    }
}

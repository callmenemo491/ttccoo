package p362uh;

/* renamed from: uh.j */
/* loaded from: classes.dex */
public final class C6464j extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.CharSequence, java.lang.Integer, ch.C0978e<? extends java.lang.Integer, ? extends java.lang.Integer>> {

    /* renamed from: Z */
    public final /* synthetic */ char[] f25051Z;

    /* renamed from: a0 */
    public final /* synthetic */ boolean f25052a0;

    public C6464j(char[] r1, boolean r2) {
            r0 = this;
            r0.f25051Z = r1
            r0.f25052a0 = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0978e<? extends java.lang.Integer, ? extends java.lang.Integer> mo122l(java.lang.CharSequence r3, java.lang.Integer r4) {
            r2 = this;
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r0 = "$this$$receiver"
            p214m2.C4339q.m9706k(r3, r0)
            char[] r0 = r2.f25051Z
            boolean r1 = r2.f25052a0
            int r3 = p362uh.C6467m.m13071b0(r3, r0, r4, r1)
            if (r3 >= 0) goto L19
            r3 = 0
            goto L28
        L19:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ch.e r0 = new ch.e
            r0.<init>(r3, r4)
            r3 = r0
        L28:
            return r3
    }
}

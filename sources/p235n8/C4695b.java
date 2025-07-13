package p235n8;

/* renamed from: n8.b */
/* loaded from: classes.dex */
public final class C4695b extends androidx.appcompat.view.menu.C0211e {

    /* renamed from: A */
    public final int f18739A;

    /* renamed from: z */
    public final java.lang.Class<?> f18740z;

    public C4695b(android.content.Context r1, java.lang.Class<?> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f18740z = r2
            r0.f18739A = r3
            return
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: a */
    public android.view.MenuItem mo498a(int r4, int r5, int r6, java.lang.CharSequence r7) {
            r3 = this;
            int r0 = r3.size()
            r1 = 1
            int r0 = r0 + r1
            int r2 = r3.f18739A
            if (r0 > r2) goto L1b
            r3.m522y()
            android.view.MenuItem r4 = super.mo498a(r4, r5, r6, r7)
            r5 = r4
            androidx.appcompat.view.menu.g r5 = (androidx.appcompat.view.menu.C0213g) r5
            r5.m537k(r1)
            r3.m521x()
            return r4
        L1b:
            java.lang.Class<?> r4 = r3.f18740z
            java.lang.String r4 = r4.getSimpleName()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Maximum number of items supported by "
            java.lang.String r7 = " is "
            java.lang.StringBuilder r6 = androidx.activity.result.C0196d.m449a(r6, r4, r7)
            int r7 = r3.f18739A
            r6.append(r7)
            java.lang.String r7 = ". Limit can be checked with "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = "#getMaxItemCount()"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // androidx.appcompat.view.menu.C0211e, android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<?> r3 = r0.f18740z
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " does not support submenus"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}

package je;

/* renamed from: je.m */
/* loaded from: classes.dex */
public final class C3591m<T> implements java.util.Comparator {
    public C3591m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r4, T r5) {
            r3 = this;
            je.l r4 = (je.C3590l) r4
            je.b r4 = r4.f15730d0
            je.b r0 = je.EnumC3580b.f15695Z
            r1 = 1
            r2 = 0
            if (r4 != r0) goto Lc
            r4 = 0
            goto Ld
        Lc:
            r4 = 1
        Ld:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            je.l r5 = (je.C3590l) r5
            je.b r5 = r5.f15730d0
            if (r5 != r0) goto L18
            r1 = 0
        L18:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r4 = p079eh.C1850a.m4597b(r4, r5)
            return r4
    }
}

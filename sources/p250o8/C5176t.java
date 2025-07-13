package p250o8;

/* renamed from: o8.t */
/* loaded from: classes.dex */
public final class C5176t extends p250o8.AbstractC5159c {

    /* renamed from: g */
    public int f20303g;

    /* renamed from: h */
    public int f20304h;

    /* renamed from: i */
    public boolean f20305i;

    public C5176t(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            int r0 = com.google.android.material.progressindicator.LinearProgressIndicator.f6253m0
            r0 = 2132017949(0x7f14031d, float:1.967419E38)
            r1 = 2130969197(0x7f04026d, float:1.754707E38)
            r10.<init>(r11, r12, r1, r0)
            int[] r8 = p339t7.C6183a.f24020q
            r9 = 0
            int[] r7 = new int[r9]
            p220m8.C4429m.m9878a(r11, r12, r1, r0)
            r5 = 2130969197(0x7f04026d, float:1.754707E38)
            r6 = 2132017949(0x7f14031d, float:1.967419E38)
            r2 = r11
            r3 = r12
            r4 = r8
            p220m8.C4429m.m9879b(r2, r3, r4, r5, r6, r7)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r1, r0)
            r12 = 1
            int r0 = r11.getInt(r9, r12)
            r10.f20303g = r0
            int r0 = r11.getInt(r12, r9)
            r10.f20304h = r0
            r11.recycle()
            r10.mo11470a()
            int r11 = r10.f20304h
            if (r11 != r12) goto L3b
            r9 = 1
        L3b:
            r10.f20305i = r9
            return
    }

    @Override // p250o8.AbstractC5159c
    /* renamed from: a */
    public void mo11470a() {
            r2 = this;
            int r0 = r2.f20303g
            if (r0 != 0) goto L1f
            int r0 = r2.f20230b
            if (r0 > 0) goto L17
            int[] r0 = r2.f20231c
            int r0 = r0.length
            r1 = 3
            if (r0 < r1) goto Lf
            goto L1f
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Contiguous indeterminate animation must be used with 3 or more indicator colors."
            r0.<init>(r1)
            throw r0
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Rounded corners are not supported in contiguous indeterminate animation."
            r0.<init>(r1)
            throw r0
        L1f:
            return
    }
}

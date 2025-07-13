package p250o8;

/* renamed from: o8.h */
/* loaded from: classes.dex */
public final class C5164h extends p250o8.AbstractC5159c {

    /* renamed from: g */
    public int f20254g;

    /* renamed from: h */
    public int f20255h;

    /* renamed from: i */
    public int f20256i;

    public C5164h(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            int r0 = com.google.android.material.progressindicator.CircularProgressIndicator.f6252m0
            r0 = 2132017937(0x7f140311, float:1.9674167E38)
            r1 = 2130968797(0x7f0400dd, float:1.7546258E38)
            r12.<init>(r13, r14, r1, r0)
            android.content.res.Resources r2 = r13.getResources()
            r3 = 2131165618(0x7f0701b2, float:1.7945458E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.content.res.Resources r3 = r13.getResources()
            r4 = 2131165613(0x7f0701ad, float:1.7945448E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int[] r10 = p339t7.C6183a.f24013j
            r11 = 0
            int[] r9 = new int[r11]
            p220m8.C4429m.m9878a(r13, r14, r1, r0)
            r8 = 2132017937(0x7f140311, float:1.9674167E38)
            r7 = 2130968797(0x7f0400dd, float:1.7546258E38)
            r4 = r13
            r5 = r14
            r6 = r10
            p220m8.C4429m.m9879b(r4, r5, r6, r7, r8, r9)
            android.content.res.TypedArray r14 = r13.obtainStyledAttributes(r14, r10, r1, r0)
            r0 = 2
            int r1 = p288q8.C5599c.m11877c(r13, r14, r0, r2)
            int r2 = r12.f20229a
            int r2 = r2 * 2
            int r0 = java.lang.Math.max(r1, r2)
            r12.f20254g = r0
            r0 = 1
            int r13 = p288q8.C5599c.m11877c(r13, r14, r0, r3)
            r12.f20255h = r13
            int r13 = r14.getInt(r11, r11)
            r12.f20256i = r13
            r14.recycle()
            return
    }

    @Override // p250o8.AbstractC5159c
    /* renamed from: a */
    public void mo11470a() {
            r0 = this;
            return
    }
}

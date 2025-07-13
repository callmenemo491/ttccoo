package p250o8;

/* renamed from: o8.c */
/* loaded from: classes.dex */
public abstract class AbstractC5159c {

    /* renamed from: a */
    public int f20229a;

    /* renamed from: b */
    public int f20230b;

    /* renamed from: c */
    public int[] f20231c;

    /* renamed from: d */
    public int f20232d;

    /* renamed from: e */
    public int f20233e;

    /* renamed from: f */
    public int f20234f;

    public AbstractC5159c(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
            r9 = this;
            r9.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r9.f20231c = r1
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2131165624(0x7f0701b8, float:1.794547E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r8 = p339t7.C6183a.f24007d
            int[] r7 = new int[r0]
            p220m8.C4429m.m9878a(r10, r11, r12, r13)
            r2 = r10
            r3 = r11
            r4 = r8
            r5 = r12
            r6 = r13
            p220m8.C4429m.m9879b(r2, r3, r4, r5, r6, r7)
            android.content.res.TypedArray r11 = r10.obtainStyledAttributes(r11, r8, r12, r13)
            r12 = 8
            int r12 = p288q8.C5599c.m11877c(r10, r11, r12, r1)
            r9.f20229a = r12
            r12 = 7
            int r12 = p288q8.C5599c.m11877c(r10, r11, r12, r0)
            int r13 = r9.f20229a
            r1 = 2
            int r13 = r13 / r1
            int r12 = java.lang.Math.min(r12, r13)
            r9.f20230b = r12
            r12 = 4
            int r12 = r11.getInt(r12, r0)
            r9.f20233e = r12
            r12 = 1
            int r13 = r11.getInt(r12, r0)
            r9.f20234f = r13
            boolean r13 = r11.hasValue(r1)
            r2 = -1
            if (r13 != 0) goto L60
            int[] r13 = new int[r12]
            r1 = 2130968831(0x7f0400ff, float:1.7546327E38)
            int r1 = p124h7.C2939x3.m7285k(r10, r1, r2)
            r13[r0] = r1
            r9.f20231c = r13
            goto L84
        L60:
            android.util.TypedValue r13 = r11.peekValue(r1)
            int r13 = r13.type
            if (r13 == r12) goto L73
            int[] r13 = new int[r12]
            int r1 = r11.getColor(r1, r2)
            r13[r0] = r1
            r9.f20231c = r13
            goto L84
        L73:
            android.content.res.Resources r13 = r10.getResources()
            int r1 = r11.getResourceId(r1, r2)
            int[] r13 = r13.getIntArray(r1)
            r9.f20231c = r13
            int r13 = r13.length
            if (r13 == 0) goto Lc0
        L84:
            r13 = 6
            boolean r1 = r11.hasValue(r13)
            if (r1 == 0) goto L90
            int r10 = r11.getColor(r13, r2)
            goto Lba
        L90:
            int[] r13 = r9.f20231c
            r13 = r13[r0]
            r9.f20232d = r13
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r12 = new int[r12]
            r13 = 16842803(0x1010033, float:2.36937E-38)
            r12[r0] = r13
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r12)
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            float r12 = r10.getFloat(r0, r12)
            r10.recycle()
            r10 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r9.f20232d
            int r10 = p124h7.C2939x3.m7284j(r12, r10)
        Lba:
            r9.f20232d = r10
            r11.recycle()
            return
        Lc0:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "indicatorColors cannot be empty when indicatorColor is not used."
            r10.<init>(r11)
            throw r10
    }

    /* renamed from: a */
    public abstract void mo11470a();
}

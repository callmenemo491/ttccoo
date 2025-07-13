package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.l */
/* loaded from: classes.dex */
public final class C0492l {
    /* renamed from: a */
    public static int m1516a(android.content.Context r4) {
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            if (r1 >= r2) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources r4 = r4.getResources()
            if (r1 == 0) goto L21
            r1 = 2131165461(0x7f070115, float:1.794514E38)
            goto L24
        L21:
            r1 = 2131165460(0x7f070114, float:1.7945138E38)
        L24:
            r4.getValue(r1, r2, r3)
            int r4 = r2.type
            r1 = 5
            if (r4 != r1) goto L32
            float r4 = r2.getDimension(r0)
        L30:
            int r4 = (int) r4
            return r4
        L32:
            r1 = 6
            if (r4 != r1) goto L3e
            int r4 = r0.widthPixels
            float r0 = (float) r4
            float r4 = (float) r4
            float r4 = r2.getFraction(r0, r4)
            goto L30
        L3e:
            r4 = -2
            return r4
    }

    /* renamed from: b */
    public static int m1517b(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131034115(0x7f050003, float:1.7678738E38)
            boolean r0 = r0.getBoolean(r1)
            if (r0 != 0) goto Lf
            r2 = -1
            return r2
        Lf:
            int r2 = m1516a(r2)
            return r2
    }
}

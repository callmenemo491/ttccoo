package androidx.fragment.app;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public class C0401q implements androidx.savedstate.C0620a.b {

    /* renamed from: a */
    public final /* synthetic */ androidx.fragment.app.ActivityC0405s f2337a;

    public C0401q(androidx.fragment.app.ActivityC0405s r1) {
            r0 = this;
            r0.f2337a = r1
            r0.<init>()
            return
    }

    @Override // androidx.savedstate.C0620a.b
    /* renamed from: a */
    public android.os.Bundle mo1350a() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.s r1 = r4.f2337a
        L7:
            androidx.fragment.app.d0 r2 = r1.m1354t()
            androidx.lifecycle.o$c r3 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            boolean r2 = androidx.fragment.app.ActivityC0405s.m1352u(r2, r3)
            if (r2 != 0) goto L7
            androidx.fragment.app.s r1 = r4.f2337a
            androidx.lifecycle.w r1 = r1.f2355g0
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            r1.m1462e(r2)
            androidx.fragment.app.s r1 = r4.f2337a
            androidx.fragment.app.y r1 = r1.f2354f0
            androidx.fragment.app.a0<?> r1 = r1.f2420a
            androidx.fragment.app.d0 r1 = r1.f2036b0
            android.os.Parcelable r1 = r1.m1162c0()
            if (r1 == 0) goto L2f
            java.lang.String r2 = "android:support:fragments"
            r0.putParcelable(r2, r1)
        L2f:
            return r0
    }
}

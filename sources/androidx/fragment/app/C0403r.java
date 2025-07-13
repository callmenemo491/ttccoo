package androidx.fragment.app;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public class C0403r implements p029c.InterfaceC0813b {

    /* renamed from: a */
    public final /* synthetic */ androidx.fragment.app.ActivityC0405s f2346a;

    public C0403r(androidx.fragment.app.ActivityC0405s r1) {
            r0 = this;
            r0.f2346a = r1
            r0.<init>()
            return
    }

    @Override // p029c.InterfaceC0813b
    /* renamed from: a */
    public void mo1351a(android.content.Context r3) {
            r2 = this;
            androidx.fragment.app.s r3 = r2.f2346a
            androidx.fragment.app.y r3 = r3.f2354f0
            androidx.fragment.app.a0<?> r3 = r3.f2420a
            androidx.fragment.app.d0 r0 = r3.f2036b0
            r1 = 0
            r0.m1159b(r3, r3, r1)
            androidx.fragment.app.s r3 = r2.f2346a
            androidx.savedstate.b r3 = r3.f587b0
            androidx.savedstate.a r3 = r3.f3684b
            java.lang.String r0 = "android:support:fragments"
            android.os.Bundle r3 = r3.m2153a(r0)
            if (r3 == 0) goto L36
            android.os.Parcelable r3 = r3.getParcelable(r0)
            androidx.fragment.app.s r0 = r2.f2346a
            androidx.fragment.app.y r0 = r0.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            boolean r1 = r0 instanceof androidx.lifecycle.InterfaceC0469t0
            if (r1 == 0) goto L2e
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1160b0(r3)
            goto L36
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig()."
            r3.<init>(r0)
            throw r3
        L36:
            return
    }
}

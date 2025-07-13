package p452z9;

/* renamed from: z9.d */
/* loaded from: classes.dex */
public class C7262d implements p327s7.InterfaceC5977a<java.lang.Void, java.lang.Object> {
    public C7262d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public java.lang.Object mo816g(p327s7.AbstractC5985i<java.lang.Void> r3) {
            r2 = this;
            boolean r0 = r3.mo12455m()
            if (r0 != 0) goto L11
            java.lang.Exception r3 = r3.mo12450h()
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "Error fetching settings."
            android.util.Log.e(r0, r1, r3)
        L11:
            r3 = 0
            return r3
    }
}

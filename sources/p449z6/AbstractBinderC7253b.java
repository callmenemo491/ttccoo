package p449z6;

/* renamed from: z6.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7253b extends p165j7.BinderC3448a implements p449z6.InterfaceC7252a {
    public AbstractBinderC7253b() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.flags.IFlagProvider"
            r1.<init>(r0)
            return
    }

    public static p449z6.InterfaceC7252a asInterface(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.flags.IFlagProvider"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p449z6.InterfaceC7252a
            if (r1 == 0) goto L11
            z6.a r0 = (p449z6.InterfaceC7252a) r0
            return r0
        L11:
            z6.c r0 = new z6.c
            r0.<init>(r2)
            return r0
    }
}

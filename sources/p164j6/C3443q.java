package p164j6;

/* renamed from: j6.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C3443q implements p327s7.InterfaceC5977a {

    /* renamed from: Y */
    public static final p327s7.InterfaceC5977a f14912Y = null;

    static {
            j6.q r0 = new j6.q
            r0.<init>()
            p164j6.C3443q.f14912Y = r0
            return
    }

    public C3443q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public final java.lang.Object mo816g(p327s7.AbstractC5985i r5) {
            r4 = this;
            int r0 = p164j6.C3429c.f14874h
            boolean r0 = r5.mo12455m()
            if (r0 == 0) goto Lf
            java.lang.Object r5 = r5.mo12451i()
            android.os.Bundle r5 = (android.os.Bundle) r5
            return r5
        Lf:
            r0 = 3
            java.lang.String r1 = "Rpc"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L3a
            java.lang.Exception r0 = r5.mo12450h()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Error making request: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r1, r0)
        L3a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Exception r5 = r5.mo12450h()
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            r0.<init>(r1, r5)
            throw r0
    }
}

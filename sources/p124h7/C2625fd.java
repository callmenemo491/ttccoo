package p124h7;

/* renamed from: h7.fd */
/* loaded from: classes.dex */
public class C2625fd implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final /* synthetic */ int f11516Y;

    /* renamed from: Z */
    public java.lang.String f11517Z;

    public C2625fd() {
            r1 = this;
            r0 = 6
            r1.f11516Y = r0
            r1.<init>()
            return
    }

    public C2625fd(java.lang.String r2, int r3) {
            r1 = this;
            r1.f11516Y = r3
            r0 = 1
            if (r3 == r0) goto L3b
            r0 = 2
            if (r3 == r0) goto L32
            r0 = 3
            if (r3 == r0) goto L29
            r0 = 4
            if (r3 == r0) goto L20
            r0 = 5
            if (r3 == r0) goto L17
            r1.f11517Z = r2
            r1.<init>()
            return
        L17:
            r1.<init>()
            java.util.Objects.requireNonNull(r2)
            r1.f11517Z = r2
            return
        L20:
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11517Z = r2
            return
        L29:
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11517Z = r2
            return
        L32:
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11517Z = r2
            return
        L3b:
            r1.f11517Z = r2
            r1.<init>()
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public java.lang.String mo27a() {
            r3 = this;
            int r0 = r3.f11516Y
            java.lang.String r1 = "idToken"
            switch(r0) {
                case 3: goto L8;
                default: goto L7;
            }
        L7:
            goto L17
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = r3.f11517Z
            r0.put(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        L17:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = r3.f11517Z
            r0.put(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: b */
    public org.json.JSONObject m6721b() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.f11517Z
            java.lang.String r2 = "appSignatureHash"
            r0.put(r2, r1)
            return r0
    }
}

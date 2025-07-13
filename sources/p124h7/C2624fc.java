package p124h7;

/* renamed from: h7.fc */
/* loaded from: classes.dex */
public class C2624fc {

    /* renamed from: a */
    public final p124h7.InterfaceC2804pc f11514a;

    /* renamed from: b */
    public final p306r6.C5797a f11515b;

    public C2624fc(p124h7.InterfaceC2804pc r2, p306r6.C5797a r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f11514a = r2
            java.util.Objects.requireNonNull(r3, r0)
            r1.f11515b = r3
            return
    }

    /* renamed from: a */
    public final void m6713a(java.lang.String r5) {
            r4 = this;
            h7.pc r0 = r4.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6752M1(r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r5 = move-exception
            r6.a r0 = r4.f11515b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending auto retrieval timeout response."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
            return
    }

    /* renamed from: b */
    public void mo6714b(java.lang.String r5) {
            r4 = this;
            h7.pc r0 = r4.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6760o1(r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r5 = move-exception
            r6.a r0 = r4.f11515b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending send verification code response."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
            return
    }

    /* renamed from: c */
    public final void m6715c(p124h7.C2964ya r5) {
            r4 = this;
            h7.pc r0 = r4.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6754T0(r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r5 = move-exception
            r6.a r0 = r4.f11515b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending failure result for mfa"
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
            return
    }

    /* renamed from: d */
    public void mo6716d(com.google.android.gms.common.api.Status r5) {
            r4 = this;
            h7.pc r0 = r4.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6748G1(r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r5 = move-exception
            r6.a r0 = r4.f11515b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending failure result."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
            return
    }

    /* renamed from: e */
    public final void m6717e(p124h7.C2752me r4, p124h7.C2644ge r5) {
            r3 = this;
            h7.pc r0 = r3.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6755d1(r4, r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r4 = move-exception
            r6.a r5 = r3.f11515b
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r5.f22479a
            java.lang.String r2 = "RemoteException when sending get token and account info user response"
            java.lang.String r5 = r5.m12162c(r2, r0)
            android.util.Log.e(r1, r5, r4)
            return
    }

    /* renamed from: f */
    public final void m6718f(p124h7.C2914ve r5) {
            r4 = this;
            h7.pc r0 = r4.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6757f1(r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r5 = move-exception
            r6.a r0 = r4.f11515b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending password reset response."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
            return
    }

    /* renamed from: g */
    public final void m6719g() {
            r5 = this;
            h7.pc r0 = r5.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6758l()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            r6.a r1 = r5.f11515b
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f22479a
            java.lang.String r4 = "RemoteException when setting FirebaseUI Version"
            java.lang.String r1 = r1.m12162c(r4, r2)
            android.util.Log.e(r3, r1, r0)
            return
    }

    /* renamed from: h */
    public final void m6720h(p375v9.C6624v r5) {
            r4 = this;
            h7.pc r0 = r4.f11514a     // Catch: android.os.RemoteException -> L6
            r0.mo6750K(r5)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r5 = move-exception
            r6.a r0 = r4.f11515b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending verification completed response."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
            return
    }
}

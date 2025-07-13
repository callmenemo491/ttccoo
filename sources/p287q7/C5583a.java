package p287q7;

/* renamed from: q7.a */
/* loaded from: classes.dex */
public class C5583a extends p248o6.AbstractC4910h<p287q7.InterfaceC5590h> implements p271p7.InterfaceC5374d {

    /* renamed from: A0 */
    public final p248o6.C4902d f21729A0;

    /* renamed from: B0 */
    public final android.os.Bundle f21730B0;

    /* renamed from: C0 */
    public final java.lang.Integer f21731C0;

    /* renamed from: z0 */
    public final boolean f21732z0;

    public C5583a(@androidx.annotation.RecentlyNonNull android.content.Context r8, @androidx.annotation.RecentlyNonNull android.os.Looper r9, boolean r10, @androidx.annotation.RecentlyNonNull p248o6.C4902d r11, @androidx.annotation.RecentlyNonNull android.os.Bundle r12, @androidx.annotation.RecentlyNonNull p201l6.AbstractC4184d.a r13, @androidx.annotation.RecentlyNonNull p201l6.AbstractC4184d.b r14) {
            r7 = this;
            r3 = 44
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f21732z0 = r10
            r7.f21729A0 = r11
            r7.f21730B0 = r12
            java.lang.Integer r8 = r11.f19465h
            r7.f21731C0 = r8
            return
    }

    @Override // p248o6.AbstractC4900c
    @androidx.annotation.RecentlyNonNull
    /* renamed from: A */
    public java.lang.String mo2635A() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.service.START"
            return r0
    }

    @Override // p271p7.InterfaceC5374d
    /* renamed from: e */
    public final void mo11727e(p287q7.InterfaceC5588f r6) {
            r5 = this;
            o6.d r0 = r5.f21729A0     // Catch: android.os.RemoteException -> L42
            android.accounts.Account r0 = r0.f19458a     // Catch: android.os.RemoteException -> L42
            java.lang.String r1 = "<<default account>>"
            if (r0 == 0) goto L9
            goto L10
        L9:
            android.accounts.Account r0 = new android.accounts.Account     // Catch: android.os.RemoteException -> L42
            java.lang.String r2 = "com.google"
            r0.<init>(r1, r2)     // Catch: android.os.RemoteException -> L42
        L10:
            r2 = 0
            java.lang.String r3 = r0.name     // Catch: android.os.RemoteException -> L42
            boolean r1 = r1.equals(r3)     // Catch: android.os.RemoteException -> L42
            if (r1 == 0) goto L23
            android.content.Context r1 = r5.f19417a0     // Catch: android.os.RemoteException -> L42
            b6.a r1 = p023b6.C0682a.m2242a(r1)     // Catch: android.os.RemoteException -> L42
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r1.m2243b()     // Catch: android.os.RemoteException -> L42
        L23:
            o6.c0 r1 = new o6.c0     // Catch: android.os.RemoteException -> L42
            java.lang.Integer r3 = r5.f21731C0     // Catch: android.os.RemoteException -> L42
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r3, r4)     // Catch: android.os.RemoteException -> L42
            int r3 = r3.intValue()     // Catch: android.os.RemoteException -> L42
            r1.<init>(r0, r3, r2)     // Catch: android.os.RemoteException -> L42
            android.os.IInterface r0 = r5.m11053y()     // Catch: android.os.RemoteException -> L42
            q7.h r0 = (p287q7.InterfaceC5590h) r0     // Catch: android.os.RemoteException -> L42
            q7.k r2 = new q7.k     // Catch: android.os.RemoteException -> L42
            r2.<init>(r1)     // Catch: android.os.RemoteException -> L42
            r0.mo11870R0(r2, r6)     // Catch: android.os.RemoteException -> L42
            return
        L42:
            r0 = move-exception
            java.lang.String r1 = "SignInClientImpl"
            java.lang.String r2 = "Remote service probably died when signIn is called"
            android.util.Log.w(r1, r2)
            q7.l r2 = new q7.l     // Catch: android.os.RemoteException -> L5c
            r2.<init>()     // Catch: android.os.RemoteException -> L5c
            m6.t r6 = (p218m6.BinderC4407t) r6     // Catch: android.os.RemoteException -> L5c
            android.os.Handler r3 = r6.f17980b     // Catch: android.os.RemoteException -> L5c
            h6.a0 r4 = new h6.a0     // Catch: android.os.RemoteException -> L5c
            r4.<init>(r6, r2)     // Catch: android.os.RemoteException -> L5c
            r3.post(r4)     // Catch: android.os.RemoteException -> L5c
            return
        L5c:
            java.lang.String r6 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."
            android.util.Log.wtf(r1, r6, r0)
            return
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: h */
    public int mo2636h() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: o */
    public boolean mo9323o() {
            r1 = this;
            boolean r0 = r1.f21732z0
            return r0
    }

    @Override // p271p7.InterfaceC5374d
    /* renamed from: p */
    public final void mo11728p() {
            r1 = this;
            o6.c$d r0 = new o6.c$d
            r0.<init>(r1)
            r1.m11049q(r0)
            return
    }

    @Override // p248o6.AbstractC4900c
    @androidx.annotation.RecentlyNonNull
    /* renamed from: s */
    public /* synthetic */ android.os.IInterface mo2637s(@androidx.annotation.RecentlyNonNull android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p287q7.InterfaceC5590h
            if (r1 == 0) goto L11
            q7.h r0 = (p287q7.InterfaceC5590h) r0
            return r0
        L11:
            q7.g r0 = new q7.g
            r0.<init>(r3)
            return r0
    }

    @Override // p248o6.AbstractC4900c
    @androidx.annotation.RecentlyNonNull
    /* renamed from: w */
    public android.os.Bundle mo6391w() {
            r3 = this;
            o6.d r0 = r3.f21729A0
            java.lang.String r0 = r0.f19462e
            android.content.Context r1 = r3.f19417a0
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1b
            android.os.Bundle r0 = r3.f21730B0
            o6.d r1 = r3.f21729A0
            java.lang.String r1 = r1.f19462e
            java.lang.String r2 = "com.google.android.gms.signin.internal.realClientPackageName"
            r0.putString(r2, r1)
        L1b:
            android.os.Bundle r0 = r3.f21730B0
            return r0
    }

    @Override // p248o6.AbstractC4900c
    @androidx.annotation.RecentlyNonNull
    /* renamed from: z */
    public java.lang.String mo2639z() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            return r0
    }
}

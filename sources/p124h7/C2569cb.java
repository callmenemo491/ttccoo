package p124h7;

/* renamed from: h7.cb */
/* loaded from: classes.dex */
public final class C2569cb implements p124h7.InterfaceC2697jd<p124h7.C2931wd> {

    /* renamed from: Y */
    public final /* synthetic */ int f11418Y;

    /* renamed from: Z */
    public final /* synthetic */ p124h7.C2624fc f11419Z;

    public C2569cb(p124h7.C2624fc r1, int r2) {
            r0 = this;
            r0.f11418Y = r2
            switch(r2) {
                case 1: goto L36;
                case 2: goto L30;
                case 3: goto L2a;
                case 4: goto L24;
                case 5: goto L1e;
                case 6: goto L18;
                case 7: goto L12;
                case 8: goto Lc;
                case 9: goto L6;
                default: goto L5;
            }
        L5:
            goto L3c
        L6:
            r0.f11419Z = r1
            r0.<init>()
            return
        Lc:
            r0.f11419Z = r1
            r0.<init>()
            return
        L12:
            r0.f11419Z = r1
            r0.<init>()
            return
        L18:
            r0.f11419Z = r1
            r0.<init>()
            return
        L1e:
            r0.f11419Z = r1
            r0.<init>()
            return
        L24:
            r0.f11419Z = r1
            r0.<init>()
            return
        L2a:
            r0.f11419Z = r1
            r0.<init>()
            return
        L30:
            r0.f11419Z = r1
            r0.<init>()
            return
        L36:
            r0.f11419Z = r1
            r0.<init>()
            return
        L3c:
            r0.f11419Z = r1
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public final void mo28b(p124h7.C2931wd r5) {
            r4 = this;
            int r0 = r4.f11418Y
            r1 = 0
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L72;
                case 2: goto L6a;
                case 3: goto L4c;
                case 4: goto L44;
                case 5: goto L3a;
                case 6: goto L30;
                case 7: goto L26;
                case 8: goto L8;
                default: goto L6;
            }
        L6:
            goto L99
        L8:
            h7.ke r5 = (p124h7.C2716ke) r5
            h7.fc r5 = r4.f11419Z
            java.util.Objects.requireNonNull(r5)
            h7.pc r0 = r5.f11514a     // Catch: android.os.RemoteException -> L15
            r0.mo6763y()     // Catch: android.os.RemoteException -> L15
            goto L25
        L15:
            r0 = move-exception
            r6.a r5 = r5.f11515b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r5.f22479a
            java.lang.String r3 = "RemoteException when sending email verification response."
            java.lang.String r5 = r5.m12162c(r3, r1)
            android.util.Log.e(r2, r5, r0)
        L25:
            return
        L26:
            h7.ff r5 = (p124h7.C2627ff) r5
            h7.fc r0 = r4.f11419Z
            java.lang.String r5 = r5.f11518Y
            r0.mo6714b(r5)
            return
        L30:
            h7.df r5 = (p124h7.C2591df) r5
            h7.fc r0 = r4.f11419Z
            java.lang.String r5 = r5.f11467Y
            r0.mo6714b(r5)
            return
        L3a:
            h7.ze r5 = (p124h7.C2986ze) r5
            h7.fc r0 = r4.f11419Z
            java.lang.String r5 = r5.f12071Y
            r0.mo6714b(r5)
            return
        L44:
            h7.ve r5 = (p124h7.C2914ve) r5
            h7.fc r0 = r4.f11419Z
            r0.m6718f(r5)
            return
        L4c:
            h7.me r5 = (p124h7.C2752me) r5
            h7.fc r0 = r4.f11419Z
            java.util.Objects.requireNonNull(r0)
            h7.pc r2 = r0.f11514a     // Catch: android.os.RemoteException -> L59
            r2.mo6751K0(r5)     // Catch: android.os.RemoteException -> L59
            goto L69
        L59:
            r5 = move-exception
            r6.a r0 = r0.f11515b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending token result."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
        L69:
            return
        L6a:
            h7.ve r5 = (p124h7.C2914ve) r5
            h7.fc r0 = r4.f11419Z
            r0.m6718f(r5)
            return
        L72:
            h7.ke r5 = (p124h7.C2716ke) r5
            h7.fc r5 = r4.f11419Z
            r0 = 0
            r5.m6718f(r0)
            return
        L7b:
            h7.wd r5 = (p124h7.C2931wd) r5
            h7.fc r0 = r4.f11419Z
            java.util.Objects.requireNonNull(r0)
            h7.pc r2 = r0.f11514a     // Catch: android.os.RemoteException -> L88
            r2.mo6749J(r5)     // Catch: android.os.RemoteException -> L88
            goto L98
        L88:
            r5 = move-exception
            r6.a r0 = r0.f11515b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending create auth uri response."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
        L98:
            return
        L99:
            h7.bf r5 = (p124h7.C2555bf) r5
            h7.fc r0 = r4.f11419Z
            java.lang.String r5 = r5.f11408Y
            java.util.Objects.requireNonNull(r0)
            h7.pc r2 = r0.f11514a     // Catch: android.os.RemoteException -> La8
            r2.mo6761w0(r5)     // Catch: android.os.RemoteException -> La8
            goto Lb8
        La8:
            r5 = move-exception
            r6.a r0 = r0.f11515b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending set account info response."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r5)
        Lb8:
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public final void mo29e(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f11418Y
            switch(r0) {
                case 0: goto L56;
                case 1: goto L4c;
                case 2: goto L42;
                case 3: goto L38;
                case 4: goto L2e;
                case 5: goto L24;
                case 6: goto L1a;
                case 7: goto L10;
                case 8: goto L6;
                default: goto L5;
            }
        L5:
            goto L60
        L6:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L10:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L1a:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L24:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L2e:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L38:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L42:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L4c:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L56:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
        L60:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11419Z
            r0.mo6716d(r2)
            return
    }
}

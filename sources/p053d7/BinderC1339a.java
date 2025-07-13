package p053d7;

/* renamed from: d7.a */
/* loaded from: classes.dex */
public class BinderC1339a extends android.os.Binder implements android.os.IInterface {
    public BinderC1339a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public boolean onTransact(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
            r2 = this;
            r0 = 0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 <= r1) goto Lb
            boolean r6 = super.onTransact(r3, r4, r5, r6)
            goto L13
        Lb:
            java.lang.String r6 = r2.getInterfaceDescriptor()
            r4.enforceInterface(r6)
            r6 = 0
        L13:
            r1 = 1
            if (r6 == 0) goto L17
            return r1
        L17:
            r6 = r2
            q7.e r6 = (p287q7.AbstractBinderC5587e) r6
            switch(r3) {
                case 3: goto L56;
                case 4: goto L4d;
                case 5: goto L1d;
                case 6: goto L4d;
                case 7: goto L3c;
                case 8: goto L27;
                case 9: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L6a
        L1e:
            android.os.Parcelable$Creator<q7.j> r3 = p287q7.C5592j.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            q7.j r3 = (p287q7.C5592j) r3
            goto L66
        L27:
            android.os.Parcelable$Creator<q7.l> r3 = p287q7.C5594l.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            q7.l r3 = (p287q7.C5594l) r3
            m6.t r6 = (p218m6.BinderC4407t) r6
            android.os.Handler r4 = r6.f17980b
            h6.a0 r0 = new h6.a0
            r0.<init>(r6, r3)
            r4.post(r0)
            goto L66
        L3c:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r3 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            goto L66
        L4d:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r3 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            goto L66
        L56:
            android.os.Parcelable$Creator<k6.b> r3 = p184k6.C3698b.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            k6.b r3 = (p184k6.C3698b) r3
            android.os.Parcelable$Creator<q7.b> r3 = p287q7.C5584b.CREATOR
            android.os.Parcelable r3 = p053d7.C1341c.m3841a(r4, r3)
            q7.b r3 = (p287q7.C5584b) r3
        L66:
            r5.writeNoException()
            r0 = 1
        L6a:
            return r0
    }
}

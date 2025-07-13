package p124h7;

/* renamed from: h7.oc */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2786oc extends p124h7.BinderC2919w1 implements p124h7.InterfaceC2804pc {
    public AbstractBinderC2786oc() {
            r1 = this;
            java.lang.String r0 = "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // p124h7.BinderC2919w1
    /* renamed from: v */
    public final boolean mo7021v(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r4 = 0
            switch(r2) {
                case 1: goto Ld0;
                case 2: goto Lb9;
                case 3: goto Laa;
                case 4: goto L9b;
                case 5: goto L8c;
                case 6: goto L85;
                case 7: goto L7e;
                case 8: goto L73;
                case 9: goto L68;
                case 10: goto L59;
                case 11: goto L4e;
                case 12: goto L36;
                case 13: goto L2e;
                case 14: goto L16;
                case 15: goto L6;
                default: goto L4;
            }
        L4:
            r2 = 0
            return r2
        L6:
            android.os.Parcelable$Creator<h7.ya> r2 = p124h7.C2964ya.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            h7.ya r2 = (p124h7.C2964ya) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6754T0(r2)
            goto Lde
        L16:
            android.os.Parcelable$Creator<h7.va> r2 = p124h7.C2910va.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            h7.va r2 = (p124h7.C2910va) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            com.google.android.gms.common.api.Status r4 = r2.f11954Y
            v9.j0 r5 = r2.f11955Z
            java.lang.String r0 = r2.f11956a0
            java.lang.String r2 = r2.f11957b0
            r3.m6762x(r4, r5, r0, r2)
            goto Lde
        L2e:
            r2 = r1
            h7.gd r2 = (p124h7.BinderC2643gd) r2
            r2.mo6758l()
            goto Lde
        L36:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            android.os.Parcelable$Creator<v9.v> r4 = p375v9.C6624v.CREATOR
            android.os.Parcelable r3 = p124h7.C2866t2.m7152a(r3, r4)
            v9.v r3 = (p375v9.C6624v) r3
            r4 = r1
            h7.gd r4 = (p124h7.BinderC2643gd) r4
            r4.mo6759o0(r2, r3)
            goto Lde
        L4e:
            java.lang.String r2 = r3.readString()
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6752M1(r2)
            throw r4
        L59:
            android.os.Parcelable$Creator<v9.v> r2 = p375v9.C6624v.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            v9.v r2 = (p375v9.C6624v) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6750K(r2)
            throw r4
        L68:
            java.lang.String r2 = r3.readString()
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6760o1(r2)
            throw r4
        L73:
            java.lang.String r2 = r3.readString()
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6761w0(r2)
            goto Lde
        L7e:
            r2 = r1
            h7.gd r2 = (p124h7.BinderC2643gd) r2
            r2.mo6763y()
            goto Lde
        L85:
            r2 = r1
            h7.gd r2 = (p124h7.BinderC2643gd) r2
            r2.mo6756e()
            goto Lde
        L8c:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6748G1(r2)
            goto Lde
        L9b:
            android.os.Parcelable$Creator<h7.ve> r2 = p124h7.C2914ve.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            h7.ve r2 = (p124h7.C2914ve) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6757f1(r2)
            goto Lde
        Laa:
            android.os.Parcelable$Creator<h7.wd> r2 = p124h7.C2931wd.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            h7.wd r2 = (p124h7.C2931wd) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6749J(r2)
            goto Lde
        Lb9:
            android.os.Parcelable$Creator<h7.me> r2 = p124h7.C2752me.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            h7.me r2 = (p124h7.C2752me) r2
            android.os.Parcelable$Creator<h7.ge> r4 = p124h7.C2644ge.CREATOR
            android.os.Parcelable r3 = p124h7.C2866t2.m7152a(r3, r4)
            h7.ge r3 = (p124h7.C2644ge) r3
            r4 = r1
            h7.gd r4 = (p124h7.BinderC2643gd) r4
            r4.mo6755d1(r2, r3)
            goto Lde
        Ld0:
            android.os.Parcelable$Creator<h7.me> r2 = p124h7.C2752me.CREATOR
            android.os.Parcelable r2 = p124h7.C2866t2.m7152a(r3, r2)
            h7.me r2 = (p124h7.C2752me) r2
            r3 = r1
            h7.gd r3 = (p124h7.BinderC2643gd) r3
            r3.mo6751K0(r2)
        Lde:
            r2 = 1
            return r2
    }
}

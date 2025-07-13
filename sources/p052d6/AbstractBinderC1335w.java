package p052d6;

/* renamed from: d6.w */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1335w extends p072e7.BinderC1622h implements p052d6.InterfaceC1336x {
    public AbstractBinderC1335w() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ISessionProxy"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r5 = 1
            r0 = 0
            switch(r2) {
                case 1: goto L8a;
                case 2: goto L76;
                case 3: goto L65;
                case 4: goto L53;
                case 5: goto L43;
                case 6: goto L39;
                case 7: goto L28;
                case 8: goto L17;
                case 9: goto L6;
                default: goto L5;
            }
        L5:
            return r0
        L6:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3 = r1
            d6.z r3 = (p052d6.BinderC1338z) r3
            d6.e r3 = r3.f6851a
            r3.mo2977h(r2)
            goto L86
        L17:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3 = r1
            d6.z r3 = (p052d6.BinderC1338z) r3
            d6.e r3 = r3.f6851a
            r3.mo2973d(r2)
            goto L86
        L28:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3 = r1
            d6.z r3 = (p052d6.BinderC1338z) r3
            d6.e r3 = r3.f6851a
            r3.mo2974e(r2)
            goto L86
        L39:
            r4.writeNoException()
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r4.writeInt(r2)
            goto L9a
        L43:
            r2 = r1
            d6.z r2 = (p052d6.BinderC1338z) r2
            d6.e r2 = r2.f6851a
            long r2 = r2.mo2972b()
            r4.writeNoException()
            r4.writeLong(r2)
            goto L9a
        L53:
            int r2 = p072e7.C1632i.f7582a
            int r2 = r3.readInt()
            if (r2 == 0) goto L5c
            r0 = 1
        L5c:
            r2 = r1
            d6.z r2 = (p052d6.BinderC1338z) r2
            d6.e r2 = r2.f6851a
            r2.mo2971a(r0)
            goto L86
        L65:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3 = r1
            d6.z r3 = (p052d6.BinderC1338z) r3
            d6.e r3 = r3.f6851a
            r3.mo2975f(r2)
            goto L86
        L76:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3 = r1
            d6.z r3 = (p052d6.BinderC1338z) r3
            d6.e r3 = r3.f6851a
            r3.mo2976g(r2)
        L86:
            r4.writeNoException()
            goto L9a
        L8a:
            r2 = r1
            d6.z r2 = (p052d6.BinderC1338z) r2
            d6.e r2 = r2.f6851a
            x6.b r3 = new x6.b
            r3.<init>(r2)
            r4.writeNoException()
            p072e7.C1632i.m4227d(r4, r3)
        L9a:
            return r5
    }
}

package p123h6;

/* renamed from: h6.f */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2497f extends p072e7.BinderC1622h implements p123h6.InterfaceC2499g {
    public AbstractBinderC2497f() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            r3 = this;
            r6 = 1
            r7 = 0
            switch(r4) {
                case 1: goto Lb8;
                case 2: goto L9d;
                case 3: goto L95;
                case 4: goto L80;
                case 5: goto L74;
                case 6: goto L68;
                case 7: goto L60;
                case 8: goto L58;
                case 9: goto L50;
                case 10: goto L3f;
                case 11: goto L32;
                case 12: goto L25;
                case 13: goto L18;
                case 14: goto Lf;
                case 15: goto L6;
                default: goto L5;
            }
        L5:
            return r7
        L6:
            int r4 = r5.readInt()
            r3.mo2954q1(r4)
            goto Lbf
        Lf:
            int r4 = r5.readInt()
            r3.mo2951h0(r4)
            goto Lbf
        L18:
            android.os.Parcelable$Creator<h6.f0> r4 = p123h6.C2498f0.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            h6.f0 r4 = (p123h6.C2498f0) r4
            r3.mo2952j1(r4)
            goto Lbf
        L25:
            android.os.Parcelable$Creator<h6.c> r4 = p123h6.C2491c.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            h6.c r4 = (p123h6.C2491c) r4
            r3.mo2947L(r4)
            goto Lbf
        L32:
            java.lang.String r4 = r5.readString()
            long r0 = r5.readLong()
            r3.mo2950U0(r4, r0)
            goto Lbf
        L3f:
            java.lang.String r4 = r5.readString()
            long r0 = r5.readLong()
            int r5 = r5.readInt()
            r3.mo2957z0(r4, r0, r5)
            goto Lbf
        L50:
            int r4 = r5.readInt()
            r3.mo2953k(r4)
            goto Lbf
        L58:
            int r4 = r5.readInt()
            r3.mo2955s(r4)
            goto Lbf
        L60:
            int r4 = r5.readInt()
            r3.mo2956t(r4)
            goto Lbf
        L68:
            java.lang.String r4 = r5.readString()
            byte[] r5 = r5.createByteArray()
            r3.mo2949R1(r4, r5)
            goto Lbf
        L74:
            java.lang.String r4 = r5.readString()
            java.lang.String r5 = r5.readString()
            r3.mo2944D1(r4, r5)
            goto Lbf
        L80:
            java.lang.String r4 = r5.readString()
            double r0 = r5.readDouble()
            int r2 = p072e7.C1632i.f7582a
            int r5 = r5.readInt()
            if (r5 == 0) goto L91
            r7 = 1
        L91:
            r3.mo2946I0(r4, r0, r7)
            goto Lbf
        L95:
            int r4 = r5.readInt()
            r3.mo2945E(r4)
            goto Lbf
        L9d:
            android.os.Parcelable$Creator<c6.d> r4 = p036c6.C0879d.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            c6.d r4 = (p036c6.C0879d) r4
            java.lang.String r0 = r5.readString()
            java.lang.String r1 = r5.readString()
            int r5 = r5.readInt()
            if (r5 == 0) goto Lb4
            r7 = 1
        Lb4:
            r3.mo2948N(r4, r0, r1, r7)
            goto Lbf
        Lb8:
            int r4 = r5.readInt()
            r3.mo2943B(r4)
        Lbf:
            return r6
    }
}

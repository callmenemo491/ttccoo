package p124h7;

/* renamed from: h7.pe */
/* loaded from: classes.dex */
public final class C2806pe implements android.os.Parcelable.Creator<p124h7.C2788oe> {
    public C2806pe() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2788oe createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = p270p6.C5368b.m11710t(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r2
        Lb:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L3d
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L38
            r3 = 2
            if (r2 == r3) goto L33
            r3 = 3
            if (r2 == r3) goto L2e
            r3 = 4
            if (r2 == r3) goto L29
            p270p6.C5368b.m11709s(r11, r1)
            goto Lb
        L29:
            long r8 = p270p6.C5368b.m11706p(r11, r1)
            goto Lb
        L2e:
            java.lang.String r7 = p270p6.C5368b.m11695e(r11, r1)
            goto Lb
        L33:
            java.lang.String r6 = p270p6.C5368b.m11695e(r11, r1)
            goto Lb
        L38:
            java.lang.String r5 = p270p6.C5368b.m11695e(r11, r1)
            goto Lb
        L3d:
            p270p6.C5368b.m11699i(r11, r0)
            h7.oe r11 = new h7.oe
            r4 = r11
            r4.<init>(r5, r6, r7, r8)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2788oe[] newArray(int r1) {
            r0 = this;
            h7.oe[] r1 = new p124h7.C2788oe[r1]
            return r1
    }
}

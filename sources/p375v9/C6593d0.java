package p375v9;

/* renamed from: v9.d0 */
/* loaded from: classes.dex */
public final class C6593d0 implements android.os.Parcelable.Creator<p375v9.C6625w> {
    public C6593d0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6625w createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = p270p6.C5368b.m11710t(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r9 = r6
            r7 = r2
        Lb:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L41
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L3b
            r3 = 2
            if (r2 == r3) goto L35
            r3 = 3
            if (r2 == r3) goto L2f
            r3 = 4
            if (r2 == r3) goto L29
            p270p6.C5368b.m11709s(r11, r1)
            goto Lb
        L29:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r9 = r1
            goto Lb
        L2f:
            long r1 = p270p6.C5368b.m11706p(r11, r1)
            r7 = r1
            goto Lb
        L35:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r6 = r1
            goto Lb
        L3b:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r5 = r1
            goto Lb
        L41:
            p270p6.C5368b.m11699i(r11, r0)
            v9.w r11 = new v9.w
            r4 = r11
            r4.<init>(r5, r6, r7, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6625w[] newArray(int r1) {
            r0 = this;
            v9.w[] r1 = new p375v9.C6625w[r1]
            return r1
    }
}

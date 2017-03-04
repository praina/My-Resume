package com.prateekraina.myresume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    LinearLayout mSummaryLayout;
    LinearLayout mEducationLayout;
    LinearLayout mEducationDetail;
    LinearLayout mAndroidProjectsLayout;
    LinearLayout mAndroidProjectsDetail;
    LinearLayout mOtherProjectsLayout;
    LinearLayout mOtherProjectsDetail;
    LinearLayout mExperienceLayout;
    LinearLayout mExperienceDetail;
    LinearLayout mSkillsLayout;
    LinearLayout mSkillsDetail;
    LinearLayout mPORLayout;
    LinearLayout mPORDetail;
    LinearLayout mECALayout;
    LinearLayout mECADetail;
    LinearLayout mInterestsLayout;
    LinearLayout mInterestsDetail;

    TextView mSummaryDetail;

    ImageView mSummaryDropdown;
    ImageView mEducationDropdown;
    ImageView mAndroidProjectsDropdown;
    ImageView mOtherProjectsDropdown;
    ImageView mExperienceDropdown;
    ImageView mSkillsDropdown;
    ImageView mPORDropdown;
    ImageView mECADropdown;
    ImageView mInterestsDropdown;

    ImageView mGamersDenLink;
    ImageView mPranksageLink;
    ImageView mTutorifyLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        FabOptions fabOptions = (FabOptions) findViewById(R.id.fab_options);
//        fabOptions.setButtonsMenu(R.menu.floating_menu);
////        fabOptions.setBackgroundColor(R.color.colorPrimaryDark);
////        fabOptions.setFabColor(R.color.colorAccent);
//        fabOptions.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                switch (v.getId()) {
//                    case R.id.faboptions_call:
//                        String phone = "+919569331022";
//                        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
//                        if (callIntent.resolveActivity(getPackageManager()) != null) {
//                            startActivity(callIntent);
//                        }
//                        break;
//
//                    case R.id.faboptions_email:
//                        String [] addresses = new String[]{"prateek.raina@iitrpr.ac.in"};
//                        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
//                        mailIntent.setData(Uri.parse("mailto:"));
//                        mailIntent.putExtra(Intent.EXTRA_EMAIL, addresses);
//                        if (mailIntent.resolveActivity(getPackageManager()) != null) {
//                            startActivity(mailIntent);
//                        }
//                        break;
//
//
//                    case R.id.faboptions_linkedin:
//                        Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/prateek-raina/"));
//                        if (linkedinIntent.resolveActivity(getPackageManager()) != null) {
//                            startActivity(linkedinIntent);
//                        }
//                        break;
//
//                    case R.id.faboptions_github:
//                        Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/praina"));
//                        if (githubIntent.resolveActivity(getPackageManager()) != null) {
//                            startActivity(githubIntent);
//                        }
//                        break;
//
//                    default:
//                        // no-op
//                }
//
//            }
//        });

        mSummaryLayout = (LinearLayout)findViewById(R.id.summaryLayout);
        mSummaryDetail = (TextView)findViewById(R.id.summaryDetail);
        mSummaryDropdown = (ImageView)findViewById(R.id.summaryDropdown);

        mEducationLayout = (LinearLayout)findViewById(R.id.educationLayout);
        mEducationDetail = (LinearLayout)findViewById(R.id.educationDetail);
        mEducationDropdown = (ImageView)findViewById(R.id.educationDropdown);

        mAndroidProjectsLayout = (LinearLayout)findViewById(R.id.androidProjectsLayout);
        mAndroidProjectsDetail = (LinearLayout)findViewById(R.id.androidProjectsDetail);
        mAndroidProjectsDropdown = (ImageView)findViewById(R.id.androidProjectsDropdown);
        mGamersDenLink = (ImageView)findViewById(R.id.gamersDenLink);
        mPranksageLink = (ImageView)findViewById(R.id.pranksageLink);
        mTutorifyLink = (ImageView)findViewById(R.id.tutorifyLink);

        mOtherProjectsLayout = (LinearLayout)findViewById(R.id.otherProjectsLayout);
        mOtherProjectsDetail = (LinearLayout)findViewById(R.id.otherProjectsDetail);
        mOtherProjectsDropdown = (ImageView)findViewById(R.id.otherProjectsDropdown);

        mExperienceLayout = (LinearLayout)findViewById(R.id.experienceLayout);
        mExperienceDetail = (LinearLayout)findViewById(R.id.experienceDetail);
        mExperienceDropdown = (ImageView)findViewById(R.id.experienceDropdown);

        mSkillsLayout = (LinearLayout)findViewById(R.id.skillsLayout);
        mSkillsDetail = (LinearLayout)findViewById(R.id.skillsDetail);
        mSkillsDropdown = (ImageView)findViewById(R.id.skillsDropdown);

        mPORLayout = (LinearLayout)findViewById(R.id.PORLayout);
        mPORDetail = (LinearLayout)findViewById(R.id.PORDetail);
        mPORDropdown = (ImageView)findViewById(R.id.PORDropdown);

        mECALayout = (LinearLayout)findViewById(R.id.ECALayout);
        mECADetail = (LinearLayout)findViewById(R.id.ECADetail);
        mECADropdown = (ImageView)findViewById(R.id.ECADropdown);

        mInterestsLayout = (LinearLayout)findViewById(R.id.interestsLayout);
        mInterestsDetail = (LinearLayout)findViewById(R.id.interestsDetail);
        mInterestsDropdown = (ImageView)findViewById(R.id.interestsDropdown);

        mSummaryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSummaryDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mSummaryDetail.setVisibility(View.VISIBLE);
                    mSummaryDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mSummaryDetail.setVisibility(View.GONE);
                    mSummaryDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }

//                ObjectAnimator animation = ObjectAnimator.ofInt(mSummaryDetail, "maxLines", mSummaryDetail.getMaxLines());
//                animation.setDuration(2000).start();
            }
        });

        mEducationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEducationDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mEducationDetail.setVisibility(View.VISIBLE);
                    mEducationDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mEducationDetail.setVisibility(View.GONE);
                    mEducationDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mAndroidProjectsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAndroidProjectsDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mAndroidProjectsDetail.setVisibility(View.VISIBLE);
                    mAndroidProjectsDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mAndroidProjectsDetail.setVisibility(View.GONE);
                    mAndroidProjectsDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mGamersDenLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/praina/GamersDen"));
                startActivity(intent);
            }
        });

        mPranksageLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.prateekraina.android.pranksage"));
                startActivity(intent);
            }
        });

        mTutorifyLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/praina/Tutorify"));
                startActivity(intent);
            }
        });

        mOtherProjectsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOtherProjectsDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mOtherProjectsDetail.setVisibility(View.VISIBLE);
                    mOtherProjectsDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mOtherProjectsDetail.setVisibility(View.GONE);
                    mOtherProjectsDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mExperienceLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mExperienceDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mExperienceDetail.setVisibility(View.VISIBLE);
                    mExperienceDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mExperienceDetail.setVisibility(View.GONE);
                    mExperienceDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mSkillsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSkillsDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mSkillsDetail.setVisibility(View.VISIBLE);
                    mSkillsDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mSkillsDetail.setVisibility(View.GONE);
                    mSkillsDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mPORLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPORDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mPORDetail.setVisibility(View.VISIBLE);
                    mPORDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mPORDetail.setVisibility(View.GONE);
                    mPORDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mECALayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mECADetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mECADetail.setVisibility(View.VISIBLE);
                    mECADropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mECADetail.setVisibility(View.GONE);
                    mECADropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });

        mInterestsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterestsDetail.getVisibility() == View.GONE) {
                    // it's collapsed - expand it
                    mInterestsDetail.setVisibility(View.VISIBLE);
                    mInterestsDropdown.setImageResource(R.drawable.ic_expand_less_black_24dp);
                } else {
                    // it's expanded - collapse it
                    mInterestsDetail.setVisibility(View.GONE);
                    mInterestsDropdown.setImageResource(R.drawable.ic_expand_more_black_24dp);
                }
            }
        });


    }
}
